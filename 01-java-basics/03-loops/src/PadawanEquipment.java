import java.util.Scanner;

public class PadawanEquipment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double lightsabersPrice = Double.parseDouble(scanner.nextLine());
        double robesPrice = Double.parseDouble(scanner.nextLine());
        double beltsPrice = Double.parseDouble(scanner.nextLine());

        double additionalLightSabers = Math.ceil(0.10 * students);
        double totalLightSabers = (students + additionalLightSabers) * lightsabersPrice;
        double totalRobes = robesPrice * students;

        double freeBelts = Math.floor(students / 6.00);
        double totalBelts = beltsPrice * (students - freeBelts);
        double moneyNeeded = totalBelts + totalLightSabers + totalRobes;

        if (moneyNeeded <= money) {
            System.out.printf("The money is enough - it would cost %.2flv.", moneyNeeded);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", moneyNeeded - money);
        }
    }
}