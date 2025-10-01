import java.util.Scanner;

public class FaceOfFigures {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();
        double area = 0;

        switch (figure) {
            case "square":
                int side = Integer.parseInt(scanner.nextLine());
                area = side * side;
                break;
            case "rectangle":
                double length = Double.parseDouble(scanner.nextLine());
                double width = Double.parseDouble(scanner.nextLine());
                area = width * length;
                break;
            case "triangle":
                double base = Double.parseDouble(scanner.nextLine());
                double height = Double.parseDouble(scanner.nextLine());
                area = 0.5 * base * height;
                break;
            case "circle":
                double radius = Double.parseDouble(scanner.nextLine());
                area = Math.PI * radius * radius;
                break;
        }
        System.out.printf("%.2f", area);
    }
}