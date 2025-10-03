import java.util.Scanner;

public class Encoding {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        while (number > 0) {
            int lastDigit = number % 10;
            if (lastDigit == 0) {
                System.out.print("ZERO");
            } else {
                for (int i = 0; i < lastDigit; i++) {
                    System.out.print((char)(lastDigit + 33));
                }
            }
            System.out.println();
            number /= 10;
        }
    }
}