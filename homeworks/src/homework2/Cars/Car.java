package homework2.Cars;

public class Car {
    private String brand;
    private String carClass;
    private double weight;
    private Driver driver;
    private Engine engine;

    public Car(String brand, String carClass, double weight, Driver driver, Engine engine) {
        this.brand = brand;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public void start () {
        System.out.println("Поехали!");
    }

    public void stop() {
        System.out.println("Стоп");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }
    public String toString () {
        return "Car: " + brand + ", Class: " + carClass + ", Weight: " + weight + " kg, " + driver + ", " + engine;
    }
}
