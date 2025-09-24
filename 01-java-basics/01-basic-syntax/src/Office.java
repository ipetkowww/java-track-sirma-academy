import java.util.Scanner;

public class Office {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstCabinetPrice = Double.parseDouble(scanner.nextLine());
        double secondCabinetPrice = firstCabinetPrice - (firstCabinetPrice * 0.2);
        double thirdCabinetPrice = firstCabinetPrice + secondCabinetPrice + ((firstCabinetPrice + secondCabinetPrice) * 0.15);

        System.out.printf("%.3f", (firstCabinetPrice + secondCabinetPrice + thirdCabinetPrice));
    }
}