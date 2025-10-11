import java.util.Arrays;
import java.util.Scanner;

public class ReverseAnArrayOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int[] array = Arrays.stream(scanner.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        int[] newArray = new int[length];

        for (int i = 0; i < length; i++) {
            newArray[newArray.length - 1 - i] = array[i];
        }

        for (int j : newArray) {
            System.out.print(j + " ");
        }
    }
}