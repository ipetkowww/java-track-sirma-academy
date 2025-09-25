import java.util.Scanner;

public class Holiday {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String destination;
        boolean isSummer = season.equals("summer");
        String typeHoliday = isSummer ? "Camp" : "Hotel";


        if (budget <= 100) {
            destination = "Bulgaria";
            if (isSummer) {
                budget *= 0.3;
            } else {
                budget *= 0.7;
            }
        } else if (budget <= 1000) {
            destination = "Europe";
            if (isSummer) {
                budget *= 0.4;
            } else {
                budget *= 0.8;
            }
        } else {
            destination = "Asia";
            budget *= 0.9;
            typeHoliday = "Hotel";
        }

        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", typeHoliday, budget);
    }
}