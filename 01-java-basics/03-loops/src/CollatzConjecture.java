import java.util.Scanner;

public class CollatzConjecture {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        while (number > 1) {
            if (number % 2 == 0) {
                System.out.printf("%d ", number);
                number /= 2;
            } else {
                System.out.printf("%d ", number);
                number = number * 3 + 1;
            }
        }
        System.out.print(1);
    }
}