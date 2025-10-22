package carinfo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int carsCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < carsCount; i++) {
            String[] parts = scanner.nextLine().split("\\s+");
            String brand = parts[0];
            String model = parts[1];
            int horsePower = Integer.parseInt(parts[2]);
            Car car = new Car(brand, model, horsePower);
            System.out.println(car);
        }
    }
}