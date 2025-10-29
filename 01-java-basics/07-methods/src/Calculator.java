import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.nextLine();
        double firstNumber = Double.parseDouble(scanner.nextLine());
        double secondNumber = Double.parseDouble(scanner.nextLine());

        printResultFromOperation(operation, firstNumber, secondNumber);
    }

    private static void printResultFromOperation(String operation, double firstNumber, double secondNumber) {
        double result = switch (operation.toLowerCase()) {
            case "add" -> add(firstNumber, secondNumber);
            case "multiply" -> multiply(firstNumber, secondNumber);
            case "subtract" -> subtract(firstNumber, secondNumber);
            case "divide" -> divide(firstNumber, secondNumber);
            default -> 0;
        };

        System.out.println(result);
    }

    private static double add(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    private static double multiply(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    private static double subtract(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    private static double divide(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }


}