import java.util.Scanner;

public class WeatherForecast {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        int degrees = Integer.parseInt(scanner.nextLine());
        System.out.printf("Today in %s it is %d degrees", city, degrees);
    }
}