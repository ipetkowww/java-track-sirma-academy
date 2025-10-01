import java.util.Scanner;

public class MakeupShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double renovationPrice = Double.parseDouble(scanner.nextLine());
        int powdersCount = Integer.parseInt(scanner.nextLine());
        double powderPrice = 2.6;
        int lipsticksCount = Integer.parseInt(scanner.nextLine());
        double lipstickPrice = 3;
        int spiralsCount = Integer.parseInt(scanner.nextLine());
        double spiralPrice = 4.1;
        int shadowsCount = Integer.parseInt(scanner.nextLine());
        double shadowsPrice = 8.2;
        int correctorsCount = Integer.parseInt(scanner.nextLine());
        double correctorsPrice = 2;


        double amount = (powderPrice * powdersCount) + (lipstickPrice * lipsticksCount) + (spiralPrice * spiralsCount)
                + (shadowsPrice * shadowsCount) + (correctorsPrice * correctorsCount);
        double makeupCount = powdersCount + lipsticksCount + spiralsCount + shadowsCount + correctorsCount;

        if (makeupCount >= 50) {
            amount -= amount * 0.25;
        }
        amount -= amount * 0.1;

        if (amount > renovationPrice) {
            System.out.printf("Yes! %.2f lv left.", amount - renovationPrice);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", renovationPrice - amount);
        }
    }
}