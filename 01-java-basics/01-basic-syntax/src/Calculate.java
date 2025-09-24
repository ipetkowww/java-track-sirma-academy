import java.util.Scanner;

public class Calculate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int sum = firstNum + secondNum;

        System.out.println("The sum is: " + sum);
        System.out.println("The difference is: " + (firstNum - secondNum));
        System.out.println("The product is: " + (firstNum * secondNum));
        System.out.println("The average is: " + (sum / 2));
    }
}