import java.util.Scanner;

public class AdventureGamePathDecision {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rightHandTool = scanner.nextLine();
        String leftHandTool = scanner.nextLine();

        if (rightHandTool.equals("sword")) {
            if (leftHandTool.equals("shield")) {
                System.out.println("Path to the castle");
            } else {
                System.out.println("Path to the forest");
            }
        } else if (rightHandTool.equals("map")) {
            if (leftHandTool.equals("coins")) {
                System.out.println("Go to the town");
            } else {
                System.out.println("Camp");
            }
        } else {
            System.out.println("Wander aimlessly");
        }
    }
}