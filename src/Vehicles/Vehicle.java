package Vehicles;
enum VehicleType {
    CAR,
    TRUCK,
    MOTORCYCLE
}

public abstract class Vehicle {
    final int releaseYear;
    final String brand;
    final VehicleType type;
    String color;

    Vehicle(VehicleType type, String color, String brand, int releaseYear) {
        this.type = type;
        this.color = color;
        this.brand = brand;
        this.releaseYear = releaseYear;
    }

    public void displayInfo() {
        System.out.print("Brand: " + brand + "," + " Type: " + type + "," + " Release Year: " + releaseYear + "," + " Color: " + color + ",");
    }
}
