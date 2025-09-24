import java.util.Scanner;

public class CircleCircumference {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int radius = Integer.parseInt(scanner.nextLine());
        System.out.printf("%.2f", 2 * Math.PI * radius);
    }
}