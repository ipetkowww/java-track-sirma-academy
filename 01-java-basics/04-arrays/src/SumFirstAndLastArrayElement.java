import java.util.Arrays;
import java.util.Scanner;

public class SumFirstAndLastArrayElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();

        System.out.println(array[0] + array[array.length - 1]);
    }
}