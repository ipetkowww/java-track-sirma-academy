import java.util.Scanner;

public class PotionBrewingDecision {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstIngredient = scanner.nextLine();
        String secondIngredient = scanner.nextLine();

        if (firstIngredient.equals("herbs")) {
            if (secondIngredient.equals("water")) {
                System.out.println("Health potion");
            } else if (secondIngredient.equals("oil")) {
                System.out.println("Stealth potion");
            } else {
                System.out.println("Minor stamina potion");
            }
        } else if (firstIngredient.equals("berries")) {
            if (secondIngredient.equals("sugar")) {
                System.out.println("Speed potion");
            } else {
                System.out.println("Minor energy potion");
            }
        } else {
            System.out.println("No potion");
        }
    }
}