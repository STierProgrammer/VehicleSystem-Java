package Vehicles;

enum VehicleType {
    CAR,
    TRUCK,
    MOTORCYCLE
}

public class Vehicle {
    VehicleType type;
    double speed;
    String color;
    final String model;

    Vehicle(VehicleType type, double speed, String color, String model) {
        this.type = type;
        this.speed = speed;
        this.color = color;
        this.model = model;
    }

    public void displayInfo() {
        System.out.println("Type: " + type + " Speed: " + speed + " Color: " + color + " Model: " + model);
    }
}
