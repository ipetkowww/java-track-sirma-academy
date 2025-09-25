import java.util.Scanner;

public class Marks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mark = Double.parseDouble(scanner.nextLine());

        if (mark >= 5.50 && mark <= 6.00) {
            System.out.println("Excellent!");
        }
    }
}