import java.util.Scanner;

public class MultiplyEvensByOdds {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(multiplyEvensByOdds(number));
    }

    private static int multiplyEvensByOdds(int number) {
        return getSumOfEvenDigits(number) * getSumOfOddDigits(number);
    }

    private static int getSumOfEvenDigits(int number) {
        int sum = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            if (lastDigit % 2 == 0) {
                sum += lastDigit;
            }
            number /= 10;
        }

        return sum;
    }

    private static int getSumOfOddDigits(int number) {
        int sum = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            if (lastDigit % 2 != 0) {
                sum += lastDigit;
            }
            number /= 10;
        }

        return sum;
    }
}