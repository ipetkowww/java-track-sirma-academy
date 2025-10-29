package students;

public class Student {

    private final String firstName;
    private final String lastName;
    private final int age;
    private final String homeTown;

    public Student(String firstName, String lastName, int age, String homeTown) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.homeTown = homeTown;
    }

    public String getHomeTown() {
        return homeTown;
    }

    @Override
    public String toString() {
        return "%s %s is %d years old".formatted(firstName, lastName, age);
    }
}