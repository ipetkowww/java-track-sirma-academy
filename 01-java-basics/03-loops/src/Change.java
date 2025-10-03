import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amount = Double.parseDouble(scanner.nextLine());

        int totalStotinki = (int) Math.round(amount * 100);
        int coinCount = 0;

        while (totalStotinki >= 200) {
            totalStotinki -= 200;
            coinCount++;
        }
        while (totalStotinki >= 100) {
            totalStotinki -= 100;
            coinCount++;
        }
        while (totalStotinki >= 50) {
            totalStotinki -= 50;
            coinCount++;
        }
        while (totalStotinki >= 20) {
            totalStotinki -= 20;
            coinCount++;
        }
        while (totalStotinki >= 10) {
            totalStotinki -= 10;
            coinCount++;
        }
        while (totalStotinki >= 5) {
            totalStotinki -= 5;
            coinCount++;
        }
        while (totalStotinki >= 2) {
            totalStotinki -= 2;
            coinCount++;
        }
        while (totalStotinki == 1) {
            totalStotinki -= 1;
            coinCount++;
        }
        System.out.println(coinCount);
    }
}