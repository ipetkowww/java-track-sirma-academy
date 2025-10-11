import java.util.Arrays;
import java.util.Scanner;

public class ExtractNonDecreasingSubsequenceFromArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        int biggestNumber = numbers[0];
        System.out.print(biggestNumber + " ");

        for (int i = 1; i < numbers.length; i++) {
            int currentNumber = numbers[i];

            if (currentNumber > biggestNumber) {
                biggestNumber = currentNumber;
                System.out.print(biggestNumber + " ");
            }
        }
    }
}