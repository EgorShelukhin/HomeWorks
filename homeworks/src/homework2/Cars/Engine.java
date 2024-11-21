package homework2.Cars;

public class Engine {
    private String manufacturer;
    private int power;

    public Engine(String manufacturer, int power) {
        this.manufacturer = manufacturer;
        this.power = power;
    }

    @Override
    public String toString() {
        return "Engine: " + power + " HP, Manufacturer: " + manufacturer;
    }
}
