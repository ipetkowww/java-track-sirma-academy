import java.util.Scanner;

public class GreaterOfTwoValues {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();

        printMax(type, scanner);
    }

    private static void printMax(String type, Scanner scanner) {
        switch (type) {
            case "int":
                int firstNumber = Integer.parseInt(scanner.nextLine());
                int secondNumber = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(firstNumber, secondNumber));
                break;
            case "char":
                char firstCharacter = scanner.nextLine().charAt(0);
                char secondCharacter = scanner.nextLine().charAt(0);
                System.out.println(getMax(firstCharacter, secondCharacter));
                break;
            case "string":
                String firstString = scanner.nextLine();
                String secondString = scanner.nextLine();
                System.out.println(getMax(firstString, secondString));
        }
    }

    private static int getMax(int firstNumber, int secondNumber) {
        return Math.max(firstNumber, secondNumber);
    }

    private static char getMax(char firstCharacter, char secondCharacter) {
        return firstCharacter > secondCharacter ? firstCharacter : secondCharacter;
    }

    private static String getMax(String firstString, String secondString) {
        return firstString.compareTo(secondString) > 0 ? firstString : secondString;
    }
}