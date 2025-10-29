package students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Student> students = new ArrayList<>();

        while (!input.equals("end")) {
            String[] parts = input.split("\\s+");
            String firstName = parts[0];
            String lastName = parts[1];
            int age = Integer.parseInt(parts[2]);
            String homeTown = parts[3];
            Student student = new Student(firstName, lastName, age, homeTown);
            students.add(student);

            input = scanner.nextLine();
        }
        String city = scanner.nextLine();

        students.forEach(s -> {
            if (s.getHomeTown().equals(city)) {
                System.out.println(s);
            }
        });
    }
}