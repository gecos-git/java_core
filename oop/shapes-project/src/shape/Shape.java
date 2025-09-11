public abstract class Shape {
    public abstract double calculateArea();

    public void printArea() {
        System.out.println("Площадь: " + calculateArea());
    }
}
