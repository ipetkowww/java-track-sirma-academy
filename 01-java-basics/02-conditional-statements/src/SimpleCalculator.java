import java.text.DecimalFormat;
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNumber = Double.parseDouble(scanner.nextLine());
        double secondNumber = Double.parseDouble(scanner.nextLine());
        String operation = scanner.nextLine();

        double result = switch (operation) {
            case "add" -> firstNumber + secondNumber;
            case "subtract" -> firstNumber - secondNumber;
            case "divide" -> firstNumber / secondNumber;
            case "multiply" -> firstNumber * secondNumber;
            default -> 0;
        };

        System.out.println(new DecimalFormat("#.##").format(result));
    }
}