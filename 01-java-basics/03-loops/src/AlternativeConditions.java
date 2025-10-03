import java.util.Scanner;

public class AlternativeConditions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();  // input number
        int num = 1;
        int row = 1;

        int totalRows = 0, count = 0;
        while (count < number) {
            totalRows++;
            count += totalRows;
        }

        while (num <= number) {
            for (int s = 0; s < totalRows - row; s++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= row && num <= number; i++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
            row++;
        }
    }
}
