import java.util.Scanner;

public class EvenPairs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstPair = Integer.parseInt(scanner.nextLine());
        int secondPair = Integer.parseInt(scanner.nextLine());
        int diffFirstPair = Integer.parseInt(scanner.nextLine());
        int diffSecondPair = Integer.parseInt(scanner.nextLine());

        int firstEnd = firstPair + diffFirstPair;
        int secondEnd = secondPair + diffSecondPair;

        for (int i = firstPair; i <= firstEnd; i++) {
            for (int j = secondPair; j <= secondEnd; j++) {
                if (isPrime(j) && isPrime(i)) {
                    System.out.printf("%d%d%n", i, j);
                }
            }
        }
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}