import java.util.Scanner;

public class DiscountCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        boolean hasMembershipCard = scanner.nextLine().equals("Yes");

        if (age < 18) {
            System.out.println("10% discount");
        } else if (age <= 64) {
            if (hasMembershipCard) {
                System.out.println("20% discount");
            } else {
                System.out.println("10% discount");
            }
        } else {
            System.out.println("30% discount");
        }
    }
}