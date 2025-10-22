package articles;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split(", ");
        Article article = new Article(parts[0], parts[1], parts[2]);
        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfCommands; i++) {
            parts = scanner.nextLine().split(": ");
            switch (parts[0]) {
                case "Edit":
                    article.edit(parts[1]);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(parts[1]);
                    break;
                case "Rename":
                    article.rename(parts[1]);
                    break;
            }
        }

        System.out.println(article);
    }
}