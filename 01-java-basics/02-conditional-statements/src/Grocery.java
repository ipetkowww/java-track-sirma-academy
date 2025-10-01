import java.util.Scanner;

public class Grocery {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String city = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        double price = 0;

        switch (product) {
            case "tea":
                if (city.equals("Sofia")) {
                    price = 0.5;
                } else if (city.equals("Plovdiv")) {
                    price = 0.4;
                } else {
                    price = 0.45;
                }
                break;
            case "water":
                if (city.equals("Sofia")) {
                    price = 0.8;
                } else {
                    price = 0.7;
                }
                break;
            case "juice":
                if (city.equals("Sofia")) {
                    price = 1.2;
                } else if (city.equals("Plovdiv")) {
                    price = 1.15;
                } else {
                    price = 1.10;
                }
                break;
            case "sweets":
                if (city.equals("Sofia")) {
                    price = 1.45;
                } else if (city.equals("Plovdiv")) {
                    price = 1.30;
                } else {
                    price = 1.35;
                }
                break;
            case "chips":
                if (city.equals("Sofia")) {
                    price = 1.6;
                } else if (city.equals("Plovdiv")) {
                    price = 1.5;
                } else {
                    price = 1.55;
                }
                break;
        }

        System.out.printf("%.2f", quantity * price);
    }
}