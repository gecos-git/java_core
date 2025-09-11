public class Main {
    public static void main(String[] args) {
        Engine engines = new Engine();
        Car cars = new Car(engines);

        cars.start();
    }
}
