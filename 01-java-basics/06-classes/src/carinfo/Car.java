package carinfo;

public class Car {

    private final String brand;
    private final String model;
    private final int horsePower;

    public Car(String brand, String model, int horsePower) {
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "The car is: %s %s – %d HP.".formatted(brand, model, horsePower);
    }
}