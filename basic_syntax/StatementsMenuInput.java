import java.util.Scanner;

public class StatementsMenuInput {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Меню:");
            System.out.println("1. Начать");
            System.out.println("2. Выйти");

            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Процесс начат...");
                break;
            } else if (choice == 2) {
                System.out.println("Выход...");
                break;
            } else {
                System.out.println("Неверный ввод, попробуйте снова");
            }
        } while (true);
    }
}
