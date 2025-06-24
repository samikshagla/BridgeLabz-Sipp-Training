public class LibraryBook {
    String title;
    String author;
    double price;
    boolean available;
    public LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }
    public void borrow() {
        if (available) available = false;
    }
    public void display() {
        System.out.println(title + " " + author + " " + price + " " + (available ? "Available" : "Not Available"));
    }
    public static void main(String[] args) {
        LibraryBook b = new LibraryBook("Java", "James", 499.99);
        b.display();
        b.borrow();
        b.display();
    }
} 