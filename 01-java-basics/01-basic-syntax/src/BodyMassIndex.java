import java.util.Scanner;

public class BodyMassIndex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int weight = Integer.parseInt(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        System.out.printf("%.2f", (weight / (height * height)));
    }
}