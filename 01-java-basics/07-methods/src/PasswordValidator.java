import java.util.Scanner;

public class PasswordValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        passwordCheck(password);
    }

    private static void passwordCheck(String password) {
        boolean isValid = true;

        if (!isLengthValid(password)) {
            System.out.println("Password must be between 6 and 10 characters");
            isValid = false;
        }
        if (!isConsistsOnlyLettersAndDigits(password)) {
            System.out.println("Password must consist only of letters and digits");
            isValid = false;
        }
        if (!hasAtLeastTwoDigits(password)) {
            System.out.println("Password must have at least 2 digits");
            isValid = false;
        }

        if (isValid) {
            System.out.println("Password is valid");
        }
    }

    private static boolean isLengthValid(String password) {
        return password.length() >= 6 && password.length() <= 10;
    }

    private static boolean isConsistsOnlyLettersAndDigits(String password) {
        boolean valid = true;
        for (int i = 0; i < password.length(); i++) {
            char currentChar = password.charAt(i);
            if (!Character.isLetterOrDigit(currentChar)) {
                valid = false;
                break;
            }
        }
        return valid;
    }

    private static boolean hasAtLeastTwoDigits(String password) {
        boolean valid = false;
        int digitCounts = 0;

        for (int i = 0; i < password.length(); i++) {
            char currentChar = password.charAt(i);
            if (Character.isDigit(currentChar)) {
                digitCounts++;
                if (digitCounts >= 2) {
                    valid = true;
                    break;
                }
            }
        }

        return valid;
    }
}