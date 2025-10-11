import java.util.Scanner;

public class ReverseAnArrayOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(",");
        String[] newArray = new String[array.length];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[array.length - 1 - i];
            newArray[newArray.length - 1 - i] = array[i];
        }

        for (String s : newArray) {
            System.out.print(s + " ");
        }
    }
}