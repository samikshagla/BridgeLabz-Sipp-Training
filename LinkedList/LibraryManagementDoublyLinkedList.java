package LinkedList;

import java.util.*;

class BookNode {
    String title, author, genre;
    int bookId;
    boolean available;
    BookNode next, prev;
    public BookNode(String title, String author, String genre, int bookId, boolean available) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookId = bookId;
        this.available = available;
        this.next = this.prev = null;
    }
}

public class LibraryManagementDoublyLinkedList {
    private BookNode head, tail;

    public void addAtBeginning(String title, String author, String genre, int bookId, boolean available) {
        BookNode newNode = new BookNode(title, author, genre, bookId, available);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addAtEnd(String title, String author, String genre, int bookId, boolean available) {
        BookNode newNode = new BookNode(title, author, genre, bookId, available);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void addAtPosition(int pos, String title, String author, String genre, int bookId, boolean available) {
        if (pos <= 1 || head == null) {
            addAtBeginning(title, author, genre, bookId, available);
            return;
        }
        BookNode temp = head;
        for (int i = 1; i < pos - 1 && temp.next != null; i++) temp = temp.next;
        BookNode newNode = new BookNode(title, author, genre, bookId, available);
        newNode.next = temp.next;
        newNode.prev = temp;
        if (temp.next != null) temp.next.prev = newNode;
        temp.next = newNode;
        if (newNode.next == null) tail = newNode;
    }

    public void removeByBookId(int bookId) {
        BookNode temp = head;
        while (temp != null && temp.bookId != bookId) temp = temp.next;
        if (temp == null) return;
        if (temp.prev != null) temp.prev.next = temp.next; else head = temp.next;
        if (temp.next != null) temp.next.prev = temp.prev; else tail = temp.prev;
    }

    public List<BookNode> searchByTitle(String title) {
        List<BookNode> result = new ArrayList<>();
        BookNode temp = head;
        while (temp != null) {
            if (temp.title.equals(title)) result.add(temp);
            temp = temp.next;
        }
        return result;
    }

    public List<BookNode> searchByAuthor(String author) {
        List<BookNode> result = new ArrayList<>();
        BookNode temp = head;
        while (temp != null) {
            if (temp.author.equals(author)) result.add(temp);
            temp = temp.next;
        }
        return result;
    }

    public void updateAvailability(int bookId, boolean available) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.bookId == bookId) temp.available = available;
            temp = temp.next;
        }
    }

    public void displayForward() {
        BookNode temp = head;
        while (temp != null) {
            System.out.println(temp.title + ", " + temp.author + ", " + temp.genre + ", ID: " + temp.bookId + ", Available: " + temp.available);
            temp = temp.next;
        }
    }

    public void displayReverse() {
        BookNode temp = tail;
        while (temp != null) {
            System.out.println(temp.title + ", " + temp.author + ", " + temp.genre + ", ID: " + temp.bookId + ", Available: " + temp.available);
            temp = temp.prev;
        }
    }

    public int countBooks() {
        int count = 0;
        BookNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void main(String[] args) {
        LibraryManagementDoublyLinkedList lib = new LibraryManagementDoublyLinkedList();
        lib.addAtEnd("Java", "Gosling", "Programming", 1, true);
        lib.addAtBeginning("C++", "Stroustrup", "Programming", 2, false);
        lib.addAtPosition(2, "Python", "Guido", "Programming", 3, true);
        lib.displayForward();
        System.out.println("--- Reverse ---");
        lib.displayReverse();
        System.out.println("Total Books: " + lib.countBooks());
        System.out.println("--- After update and remove ---");
        lib.updateAvailability(3, false);
        lib.removeByBookId(1);
        lib.displayForward();
    }
} 