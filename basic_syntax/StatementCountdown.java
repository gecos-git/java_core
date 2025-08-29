public class StatementCountdown {
    public static void main(String[] args) {
        int number = 10;

        while(number > 0) {
            System.out.println(number);
            number--;
            if (number == 0) {
                System.out.println("Старт!");
            }
        }
    }
}
