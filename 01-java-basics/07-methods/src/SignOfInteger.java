import java.util.Scanner;

public class SignOfInteger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        printSign(number);
    }

    private static void printSign(int number) {
        String message = "The number %d is ".formatted(number);

        if (number == 0) {
            message = message.concat("zero");
        } else {
            message = message.concat(number > 0 ? "positive" : "negative");
        }

        System.out.println(message);
    }
}