import java.util.Scanner;

public class Grades {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grade = Double.parseDouble(scanner.nextLine());
        printGrade(grade);
    }

    private static void printGrade(double grade) {
        String gradeMessage;

        if (grade >= 2.00 && grade <= 2.99) {
            gradeMessage = "Fail";
        } else if (grade >= 3.00 && grade <= 3.49) {
            gradeMessage = "Poor";
        } else if (grade >= 3.50 && grade <= 4.49) {
            gradeMessage = "Good";
        } else if (grade >= 4.50 && grade <= 5.49) {
            gradeMessage = "Very good";
        } else if (grade >= 5.50 && grade <= 6.00) {
            gradeMessage = "Excellent";
        } else {
            gradeMessage = "Invalid grade";
        }
        System.out.println(gradeMessage);
    }
}