package homework2.Cars;

public class Lorry extends Car{
    private int loadCapacity;

    public Lorry(String brand, String carClass, double weight, Driver driver, Engine engine, int loadCapacity) {
        super(brand, carClass, weight, driver, engine);
        this.loadCapacity = loadCapacity;
    }

    public String toString () {
        return super.toString() + ", Load Capacity: " + loadCapacity + " kg";
    }
}
