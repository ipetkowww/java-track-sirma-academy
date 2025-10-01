import java.util.Scanner;

public class UniversityAdmissions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = Integer.parseInt(scanner.nextLine());
        int activities = Integer.parseInt(scanner.nextLine());

        if (score < 80) {
            System.out.println("Not admitted");
        } else if (score <= 89) {
            if (activities >= 2) {
                System.out.println("Admitted");
            } else {
                System.out.println("Not admitted");
            }
        } else {
            System.out.println("Admitted");
        }
    }
}