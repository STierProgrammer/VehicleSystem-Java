package Vehicles;

public class Car extends Vehicle {
    final String model;

    public Car(String color, String brand, String model, int releaseYear) {
        super(VehicleType.CAR, color, brand, releaseYear);
        this.model = model;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.print(" Model: " + model);
    }
}
