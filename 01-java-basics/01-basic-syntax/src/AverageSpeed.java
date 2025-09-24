import java.util.Scanner;

public class AverageSpeed {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distance = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        int speed = distance / hours;
        System.out.println(speed);
    }
}