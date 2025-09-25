import java.util.Scanner;

public class AlarmAfter15Minutes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int totalMinutes = minutes + 15;

        if (totalMinutes >= 60) {
            hour++;
            if (hour > 23) {
                hour = 0;
            }
            minutes = totalMinutes - 60;
        } else {
            minutes += 15;
        }

        System.out.printf("%d:%02d", hour, minutes);
    }
}