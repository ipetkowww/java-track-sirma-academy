import java.util.Scanner;

public class HalfRhombusFromAsterisks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int originalNumber = number;

        for (int i = 1; i <= originalNumber * 2 - 1; i++) {
            if (i <= originalNumber) {
                for (int j = 0; j < i; j++) {
                    System.out.print("* ");
                }
            } else {
                number--;
                for (int j = 0; j < number; j++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}