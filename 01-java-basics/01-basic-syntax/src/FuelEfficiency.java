import java.util.Scanner;

public class FuelEfficiency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distance = Integer.parseInt(scanner.nextLine());
        int fuel = Integer.parseInt(scanner.nextLine());
        double fuelEfficiency = distance / (fuel * 1.0);
        System.out.println(fuelEfficiency);
    }
}