import java.util.Arrays;
import java.util.Scanner;

public class FirstAndLastKNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int[] numbers = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < number; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        for (int i = numbers.length - number; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}