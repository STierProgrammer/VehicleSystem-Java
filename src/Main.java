import Vehicles.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(
                12,
                "red",
                "Tesla",
                1999
        );

        car.displayInfo();
    }
}