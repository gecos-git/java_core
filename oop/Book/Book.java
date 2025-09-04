public class Book {
    private String title;
    private String author;
    private int year;
    
    public Book(String title, String author, int year) {
        setTitle(title);
        setAuthor(author);
        setYear(year);
    }
    
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setTitle(String title) {
        if (title != null && !title.trim().isEmpty()) {
            this.title = title;
        } else {
            System.out.println("Название книги не может быть пустым");
            this.title = "Неизвестное название";
        }
    }
    
    public void setAuthor(String author) {
        if (author != null && !author.trim().isEmpty()) {
            this.author = author;
        } else {
            System.out.println("Автор не может быть пустым");
            this.author = "Неизвестный автор";
        }
    }

    public void setYear(int year) {
        if (year >= 0 && year <= java.time.Year.now().getValue()) {
            this.year = year;
        } else {
            System.out.println("Год не может быть пустым");
            this.year = 0;
        }
    }

    void displayInfo() {
        System.out.println("Название: " + this.title + ", " + "Автор: " + this.author + ", " + "Год: " + this.year);
    }
}
