import java.util.Scanner;

public class AtSea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String assessment = scanner.nextLine();

        int nights = days - 1;
        double singleRoomPriceForNight = 25;
        double apartmentPriceForNight = 50;
        double presidentRoomPriceForNight = 100;
        double totalPrice = nights * singleRoomPriceForNight;

        switch (roomType) {
            case "apartment":
                totalPrice = nights * apartmentPriceForNight;
                if (days < 10) {
                    totalPrice -= totalPrice * 0.3;
                } else if (days <= 15) {
                    totalPrice -= totalPrice * 0.35;
                } else {
                    totalPrice -= totalPrice * 0.5;
                }
                break;
            case "presidential":
                totalPrice = nights * presidentRoomPriceForNight;
                if (days < 10) {
                    totalPrice -= totalPrice * 0.1;
                } else if (days <= 15) {
                    totalPrice -= totalPrice * 0.15;
                } else {
                    totalPrice -= totalPrice * 0.2;
                }
                break;
        }

        if (assessment.equals("positive")) {
            totalPrice += totalPrice * 0.25;
        } else {
            totalPrice -= totalPrice * 0.1;
        }

        System.out.printf("%.2f", totalPrice);
    }
}