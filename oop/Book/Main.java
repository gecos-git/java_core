public class Main {
    public static void main(String[] args) {
        Book myBook1 = new Book();
        myBook1.title = "Маленький принц";
        myBook1.author = "Антуан де Сент-Экзюпери";
        myBook1.year = 1943;
        myBook1.displayInfo();

        Book myBook2 = new Book();
        myBook2.title = "Герой нашего времени";
        myBook2.author = "Михаил Юрьевич Лермонтов";
        myBook2.year = 1840;
        myBook2.displayInfo();
    }
}
