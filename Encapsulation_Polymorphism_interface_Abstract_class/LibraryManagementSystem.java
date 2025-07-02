package Encapsulation_Polymorphism_interface_Abstract_class;

interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}

abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;
    protected String borrower;
    protected boolean reserved;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.reserved = false;
    }

    public int getItemId() { return itemId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    protected String getBorrower() { return borrower; }

    public void getItemDetails() {
        System.out.println("ID: " + itemId + ", Title: " + title + ", Author: " + author);
    }

    public abstract int getLoanDuration();
}

class Book extends LibraryItem implements Reservable {
    public Book(int itemId, String title, String author) {
        super(itemId, title, author);
    }
    @Override
    public int getLoanDuration() { return 21; }
    @Override
    public void reserveItem(String borrowerName) {
        if (!reserved) {
            reserved = true;
            borrower = borrowerName;
            System.out.println("Book reserved for " + borrowerName);
        } else {
            System.out.println("Book already reserved.");
        }
    }
    @Override
    public boolean checkAvailability() { return !reserved; }
}

class Magazine extends LibraryItem implements Reservable {
    public Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
    }
    @Override
    public int getLoanDuration() { return 7; }
    @Override
    public void reserveItem(String borrowerName) {
        if (!reserved) {
            reserved = true;
            borrower = borrowerName;
            System.out.println("Magazine reserved for " + borrowerName);
        } else {
            System.out.println("Magazine already reserved.");
        }
    }
    @Override
    public boolean checkAvailability() { return !reserved; }
}

class DVD extends LibraryItem implements Reservable {
    public DVD(int itemId, String title, String author) {
        super(itemId, title, author);
    }
    @Override
    public int getLoanDuration() { return 14; }
    @Override
    public void reserveItem(String borrowerName) {
        if (!reserved) {
            reserved = true;
            borrower = borrowerName;
            System.out.println("DVD reserved for " + borrowerName);
        } else {
            System.out.println("DVD already reserved.");
        }
    }
    @Override
    public boolean checkAvailability() { return !reserved; }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem[] items = {
            new Book(1, "Java Programming", "James Gosling"),
            new Magazine(2, "Tech Monthly", "Various"),
            new DVD(3, "Inception", "Christopher Nolan")
        };
        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            if (item instanceof Reservable) {
                ((Reservable)item).reserveItem("Alice");
                System.out.println("Available: " + ((Reservable)item).checkAvailability());
            }
            System.out.println();
        }
    }
} 