import java.util.Scanner;

public class StatementCheckNumber {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        number = scanner.nextInt();

        if (number > 0){
            System.out.println("Число положительное");
        } else if (number < 0){
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Ноль");
        }
    }
}
