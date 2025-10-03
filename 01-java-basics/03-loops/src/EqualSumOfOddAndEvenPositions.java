import java.util.Scanner;

public class EqualSumOfOddAndEvenPositions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        boolean isFoundNumber = false;

        for (int i = firstNumber; i <= secondNumber; i++) {
            int currentNumber = i;
            int digitPosition = 6;
            int evenSum = 0;
            int oddSum = 0;

            while (currentNumber > 0) {
                int lastDigit = currentNumber % 10;
                if (digitPosition % 2 == 0) {
                    evenSum += lastDigit;
                } else {
                    oddSum += lastDigit;
                }
                currentNumber /= 10;
                digitPosition--;
            }
            if (evenSum == oddSum) {
                System.out.printf("%d%n", i);
                isFoundNumber = true;
            }
        }
        if (!isFoundNumber) {
            System.out.println("None");
        }
    }
}