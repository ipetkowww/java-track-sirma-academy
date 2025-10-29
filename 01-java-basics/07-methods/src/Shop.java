import java.util.Scanner;

public class Shop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        printPrice(product, quantity);
    }

    private static void printPrice(String product, int quantity) {
        double price = calculatePrice(product, quantity);
        System.out.printf("%.2f", price);
    }

    private static double calculatePrice(String product, int quantity) {
        return switch (product) {
            case "coffee" -> 1.50 * quantity;
            case "water" -> 1.00 * quantity;
            case "coke" -> 1.40 * quantity;
            case "snacks" -> 2.00 * quantity;
            default -> 0;
        };
    }
}