import java.util.Scanner;

public class ArmstrongNumberCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int original = number;
        int digitsCount = String.valueOf(number).length();
        int sum = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            sum += Math.pow(lastDigit, digitsCount);
            number /= 10;
        }

        if (sum == original) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}