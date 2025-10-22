import java.util.Scanner;

public class Substring {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String word = scanner.nextLine();

        while (word.contains(input)) {
            word = word.replaceFirst(input, "");
        }

        System.out.println(word);
    }
}