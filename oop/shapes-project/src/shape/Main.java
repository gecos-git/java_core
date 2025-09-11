public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Rectangle(5.0, 10.0);
        shapes[1] = new Circle(7.0);

        for (Shape shape : shapes) {
            shape.printArea();
        }
    }
}
