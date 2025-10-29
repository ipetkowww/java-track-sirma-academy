import java.util.Scanner;

public class MathPower {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        double power = Double.parseDouble(scanner.nextLine());

        System.out.printf("%.3f", calculatePower(number, power));
    }

    private static double calculatePower(double number, double power) {
        return Math.pow(number, power);
    }
}