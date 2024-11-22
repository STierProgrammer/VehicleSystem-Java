package Vehicles;
enum VehicleType {
    CAR,
    TRUCK,
    MOTORCYCLE
}

public abstract class Vehicle {
    final String model;
    double speed;
    VehicleType type;
    String color;


    Vehicle(VehicleType type, double speed, String color, String model) {
        this.type = type;
        this.speed = speed;
        this.color = color;
        this.model = model;
    }

    public abstract void displayInfo();
}
