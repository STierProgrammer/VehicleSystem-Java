package Vehicles;

public class Car extends Vehicle {

    final int year;

    public Car(double speed, String color, String model, int year) {
        super(VehicleType.CAR, speed, color, model);
        this.year = year;
    }

    @Override
    public void displayInfo() {
        System.out.println("Type: " + type + " Speed: " + speed + " Color: " + color + " Model: " + model + " Year: " + year);
    }
}
