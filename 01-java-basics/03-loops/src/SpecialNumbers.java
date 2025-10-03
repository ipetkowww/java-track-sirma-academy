import java.util.Scanner;

public class SpecialNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1111; i <= 9999; i++) {
            boolean isSpecial = true;
            int currentNumber = i;
            while (currentNumber > 0) {
                int lastDigit = currentNumber % 10;
                if (lastDigit == 0 || number % lastDigit != 0) {
                    isSpecial = false;
                    break;
                }
                currentNumber /= 10;
            }
            if (isSpecial) {
                System.out.println(i);
            }
        }
    }
}