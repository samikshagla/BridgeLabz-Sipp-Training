
class Book {
    private static String libraryName = "City Library";
    private String title;
    private String author;
    private final String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    public void displayDetails() {
        if (this instanceof Book) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "Alice", "111-222");
        Book b2 = new Book("OOP Concepts", "Bob", "333-444");
        displayLibraryName();
        b1.displayDetails();
        b2.displayDetails();
    }
} 