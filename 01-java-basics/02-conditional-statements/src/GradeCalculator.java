import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int percentage = Integer.parseInt(scanner.nextLine());

        if (percentage >= 0 && percentage <=59) {
            System.out.println("F");
        } else if (percentage >= 60 && percentage <= 69) {
            System.out.println("D");
        } else if (percentage >= 70 && percentage <= 79) {
            System.out.println("C");
        } else if (percentage >= 80 && percentage <= 89) {
            System.out.println("B");
        } else if (percentage >= 90 && percentage <= 100) {
            System.out.println("A");
        }
    }
}