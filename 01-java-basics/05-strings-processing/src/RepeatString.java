import java.util.Scanner;

public class RepeatString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(word.repeat(word.length()));
        }

        System.out.println(result);
    }
}