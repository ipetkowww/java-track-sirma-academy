import java.util.Scanner;

public class CoinsAndNotes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count1LvCoins = Integer.parseInt(scanner.nextLine());
        int count2LvCoins = Integer.parseInt(scanner.nextLine());
        int count5LvBanknotes = Integer.parseInt(scanner.nextLine());
        int sum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= count1LvCoins; i++) {
            for (int j = 0; j <= count2LvCoins; j++) {
                for (int k = 0; k <= count5LvBanknotes; k++) {
                    int total = i + j * 2 + k * 5;
                    if (total == sum) {
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.%n", i, j, k, sum);
                    }
                }
            }
        }
    }
}