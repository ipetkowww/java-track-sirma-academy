import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        String result = number % 2 == 0 ? "even" : "odd";
        System.out.println(result);
    }
}