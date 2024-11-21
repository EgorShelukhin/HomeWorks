package homework2.Cars;

public class Driver {
    private String name;
    private int drivingExperience;

    public Driver(String name, int drivingExperience) {
        this.name = name;
        this.drivingExperience = drivingExperience;
    }

    @Override
    public String toString() {
        return "Driver: " + name + ", Driving Experience: " + drivingExperience + " years";
    }
}