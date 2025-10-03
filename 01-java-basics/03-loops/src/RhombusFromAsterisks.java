import java.util.Scanner;

public class RhombusFromAsterisks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        // Upper half including middle
        for (int i = 1; i <= number; i++) {
            for (int j = 0; j < number - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i - 1; j++) {
                if (j % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = number - 1; i >= 1; i--) {
            for (int j = 0; j < number - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i - 1; j++) {
                if (j % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}