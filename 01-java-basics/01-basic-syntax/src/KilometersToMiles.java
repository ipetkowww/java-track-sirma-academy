import java.util.Scanner;

public class KilometersToMiles {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double kilometers = Double.parseDouble(scanner.nextLine());
        double mile = 0.621371192;

        System.out.println(kilometers * mile);
    }
}