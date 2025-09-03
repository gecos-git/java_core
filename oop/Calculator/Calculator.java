public class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Ошибка: деление на ноль.");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double num1 = 10.2;
        double num2 = 3.5;

        System.out.println("Сумма: " + calculator.add(num1, num2));
        System.out.println("Разность: " + calculator.subtract(num1, num2));
        System.out.println("Произведение: " + calculator.multiply(num1, num2));
        System.out.println("Частное: " + calculator.divide(num1, num2));

        System.out.println("Деление на ноль: " + calculator.divide(5, 0));
    }
}
