import java.util.Scanner;

public class LeftArrowPattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        // Upper part (increasing stars)
        for (int i = 1; i <= number - 1; i++) {
            for (int s = 1; s <= number - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = number - 1; i >= 1; i--) {
            for (int s = 1; s <= number - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}