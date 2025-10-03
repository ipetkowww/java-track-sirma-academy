import java.util.Scanner;

public class PyramidOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int currentNumber = 1;
        int countOfNumbers = 1;

        while (currentNumber <= number) {
            for (int i = 0; i < countOfNumbers && currentNumber <= number; i++) {
                System.out.printf("%d ", currentNumber++);
            }
            countOfNumbers++;
            System.out.println();
        }

    }
}