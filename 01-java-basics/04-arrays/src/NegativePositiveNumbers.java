import java.util.Arrays;
import java.util.Scanner;

public class NegativePositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        int[] newArray = new int[numbers.length];
        int index = 0;

        for (int number : numbers) {
            if (number < 0) {
                newArray[index++] = number;
            }
        }
        for (int number : numbers) {
            if (number > 0) {
                newArray[index++] = number;
            }
        }

        for (int number : newArray) {
            System.out.print(number + " ");
        }
    }
}