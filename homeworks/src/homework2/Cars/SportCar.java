package homework2.Cars;

public class SportCar extends Car {
    private int maxSpeed;

    public SportCar(String brand, String carClass, double weight, Driver driver, Engine engine, int maxSpeed) {
        super(brand, carClass, weight, driver, engine);
        this.maxSpeed = maxSpeed;
    }

    public String toString() {
        return super.toString() + ", Max Speed: " + maxSpeed + " km/h";
    }
}
