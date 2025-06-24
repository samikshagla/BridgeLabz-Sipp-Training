class Book {
    public String ISBN;
    protected String title;
    private String author;
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
}
class EBook extends Book {
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }
    public void display() {
        System.out.println(ISBN + " " + title + " " + getAuthor());
    }
}
public class BookAccess {
    public static void main(String[] args) {
        EBook eb = new EBook("12345", "Java", "James");
        eb.display();
        eb.setAuthor("John");
        eb.display();
    }
} 