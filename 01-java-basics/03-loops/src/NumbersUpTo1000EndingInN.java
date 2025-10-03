import java.util.Scanner;

public class NumbersUpTo1000EndingInN {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = number; i <= 1000; i++) {
            if (i % 10 == number) {
                System.out.println(i);
            }
        }
    }
}