import Vehicles.Car;
import Vehicles.Vehicle;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(
                "Red",
                "Tesla",
                "newModel",
                1999
        );

        car.displayInfo();
    }
}

