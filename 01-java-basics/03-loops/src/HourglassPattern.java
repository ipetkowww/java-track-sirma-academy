import java.util.Scanner;

public class HourglassPattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int size = number + 2;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1) {
                    System.out.print("#");
                } else {
                    // diagonal condition only
                    if (j == i || j == size - i - 1) {
                        System.out.print("#");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}