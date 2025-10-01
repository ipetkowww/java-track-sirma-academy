import java.util.Scanner;

public class AirlineLuggageCharges {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int weight = Integer.parseInt(scanner.nextLine());
        int dimensions = Integer.parseInt(scanner.nextLine());
        int totalCharge = 0;
        boolean overweight = false;
        boolean oversize = false;

        if (weight > 50) {
            totalCharge += 100;
            overweight = true;
        }
        if (dimensions > 158) {
            int excess = dimensions - 158;

            if (excess <= 20) {
                totalCharge += 50;
            } else if (excess <= 50) {
                totalCharge += 100;
            } else {
                totalCharge += 200;
            }
            oversize = true;
        }
        if (overweight && oversize) {
            totalCharge += 50;
        }
        System.out.printf("$%d%n", totalCharge);
    }
}