import java.util.Scanner;

public class NumberReversal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        while (number > 0) {
            int lastDigit = number % 10;
            System.out.print(lastDigit);
            number /= 10;
        }
    }
}