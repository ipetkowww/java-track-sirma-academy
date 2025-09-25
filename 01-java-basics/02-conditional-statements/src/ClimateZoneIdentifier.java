import java.util.Scanner;

public class ClimateZoneIdentifier {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int latitude = Integer.parseInt(scanner.nextLine());
        String hemisphere = scanner.nextLine();

        if (latitude == 0) {
            System.out.println("Equator");
        } else if (latitude > 0 && latitude <= 23.5) {
            System.out.println("Tropic Zone");
        } else if (latitude >= 23.5 && latitude <= 66.5) {
            System.out.println("Temperate Zone");
        } else {
            System.out.println("Arctic Zone");
        }
    }
}
