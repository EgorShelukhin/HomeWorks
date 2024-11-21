package homework2.Cars;

public class Information {
    public static void main(String[] args) {
        Driver driver = new Driver("Иван Иванов", 5);
        Engine engine = new Engine("BMW", 150);
        Car car = new Car("BMW", "M5", 2000, driver, engine);

        Lorry lorry = new Lorry("Mercedes Actros", "Truck", 8000, driver, engine, 20000);
        System.out.println(lorry);

        SportCar sportCar = new SportCar("Ferrari F8", "Sports", 1450, driver, engine, 240);
        System.out.println(sportCar);

        System.out.println(car);

        car.start();
        car.turnRight();
        car.turnLeft();
        car.stop();
    }
}