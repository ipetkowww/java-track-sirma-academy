import java.util.Scanner;

public class Painting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPaintConsumed = Integer.parseInt(scanner.nextLine());

        double paintPerRoom = totalPaintConsumed / 3.0;

        double red = paintPerRoom * (1.0 / 13);
        double yellow = paintPerRoom * (4.0 / 13);
        double white = paintPerRoom * (8.0 / 13);

        System.out.printf("Red: %.4f kg%n", red);
        System.out.printf("Yellow: %.4f kg%n", yellow);
        System.out.printf("White: %.4f kg%n", white);
    }
}