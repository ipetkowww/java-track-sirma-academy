import java.util.Scanner;

public class NumbersFrom0to9WithWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        String[] numbersAsWords = {"zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine"};

        if (number >= 0 && number <= 9) {
            System.out.println(numbersAsWords[number]);
        } else {
            System.out.println("too big");
        }
    }
}