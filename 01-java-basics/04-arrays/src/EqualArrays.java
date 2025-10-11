import java.util.Scanner;

public class EqualArrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstArray = scanner.nextLine().split(",");
        String[] secondArray = scanner.nextLine().split(",");
        boolean areEqual = true;
        int diffIndex = 0;
        int sum = 0;

        for (int i = 0; i < firstArray.length; i++) {
            if (!firstArray[i].equals(secondArray[i])) {
                areEqual = false;
                diffIndex = i;
                break;
            } else {
                sum += Integer.parseInt(firstArray[i]);
            }
        }

        if (areEqual) {
            System.out.println("Arrays are identical. Sum: " + sum);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index", diffIndex);
        }
    }
}