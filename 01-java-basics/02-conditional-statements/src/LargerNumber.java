import java.util.Scanner;

public class LargerNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        System.out.println(Math.max(firstNumber, secondNumber));
    }
}