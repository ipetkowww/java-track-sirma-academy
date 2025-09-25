import java.util.Scanner;

public class VegetableMarket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String vegetable = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        double price;
        boolean isValidDay = dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday")
                || dayOfWeek.equals("Wednesday") || dayOfWeek.equals("Thursday")
                || dayOfWeek.equals("Friday") || dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday");
        boolean isWeekend = dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday");

        if (isValidDay) {
            switch (vegetable) {
                case "tomato":
                    price = isWeekend ? 2.8 : 2.5;
                    break;
                case "onion":
                    price = isWeekend ? 1.3 : 1.2;
                    break;
                case "lettuce":
                    price = 0.85;
                    break;
                case "cucumber":
                    price = isWeekend ? 1.75 : 1.45;
                    break;
                case "pepper":
                    price = isWeekend ? 3.5 : 5.5;
                    break;
                default:
                    System.out.println("error");
                    return;
            }
            System.out.printf("%.2f", quantity * price);
        } else {
            System.out.println("error");
        }
    }
}