import java.util.Scanner;

public class MathOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        String operation = scanner.nextLine();
        int secondNumber = Integer.parseInt(scanner.nextLine());

        System.out.println(printResultFromOperation(operation, firstNumber, secondNumber));
    }

    private static int printResultFromOperation(String operation, int firstNumber, int secondNumber) {
        return switch (operation.toLowerCase()) {
            case "+" -> add(firstNumber, secondNumber);
            case "*" -> multiply(firstNumber, secondNumber);
            case "-" -> subtract(firstNumber, secondNumber);
            case "/" -> divide(firstNumber, secondNumber);
            default -> 0;
        };
    }

    private static int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    private static int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    private static int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    private static int divide(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }
}