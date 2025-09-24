import java.util.Scanner;

public class WaterConsumption {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalWater = Integer.parseInt(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        double dailyConsumptionPerPerson = totalWater / 7.0 / people;
        System.out.printf("%.2f", dailyConsumptionPerPerson);
    }
}