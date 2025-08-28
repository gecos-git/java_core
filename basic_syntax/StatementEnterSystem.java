import java.util.Scanner;

public class StatementEnterSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLogin;
        String inputPassword;

        final String CORRECT_LOGIN = "admin";
        final String CORRECT_PASSWORD = "qwerty";
        
        System.out.println("Введите ваш логин: ");
        inputLogin = scanner.nextLine();
        System.out.println("Введите ваш пароль: ");
        inputPassword = scanner.nextLine();

        if (inputLogin.equals(CORRECT_LOGIN) && inputPassword.equals(CORRECT_PASSWORD)) {
            System.out.println("Доступ разрешен");
        } else {
            System.out.println("Доступ запрещен");
        }
    }
}
