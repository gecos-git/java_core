import java.util.Scanner;

public class StatementDiscountCalculator {
    public static void main(String[] args) {
        double sum;
        double discount = 15;
        double finalSum;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сумму: ");
        sum = scanner.nextDouble();

        if (sum > 1000) {
            finalSum = sum - (sum * discount / 100);
            System.out.println("К оплате: " + finalSum + " рублей");
        } else {
            finalSum = sum;
            System.out.println("К оплате: " + finalSum + " рублей");
        }

        scanner.close();
    }
}
