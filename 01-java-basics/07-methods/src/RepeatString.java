import java.util.Scanner;

public class RepeatString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int repeatTimes = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatString(text, repeatTimes));
    }

    private static String repeatString(String text, int repeatTimes) {
        return text.repeat(repeatTimes);
    }
}