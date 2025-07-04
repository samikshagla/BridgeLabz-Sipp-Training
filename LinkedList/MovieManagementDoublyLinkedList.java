package LinkedList;

import java.util.*;

class MovieNode {
    String title, director;
    int year;
    double rating;
    MovieNode next, prev;
    public MovieNode(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.next = this.prev = null;
    }
}

public class MovieManagementDoublyLinkedList {
    private MovieNode head, tail;

    public void addAtBeginning(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addAtEnd(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void addAtPosition(int pos, String title, String director, int year, double rating) {
        if (pos <= 1 || head == null) {
            addAtBeginning(title, director, year, rating);
            return;
        }
        MovieNode temp = head;
        for (int i = 1; i < pos - 1 && temp.next != null; i++) temp = temp.next;
        MovieNode newNode = new MovieNode(title, director, year, rating);
        newNode.next = temp.next;
        newNode.prev = temp;
        if (temp.next != null) temp.next.prev = newNode;
        temp.next = newNode;
        if (newNode.next == null) tail = newNode;
    }

    public void removeByTitle(String title) {
        MovieNode temp = head;
        while (temp != null && !temp.title.equals(title)) temp = temp.next;
        if (temp == null) return;
        if (temp.prev != null) temp.prev.next = temp.next; else head = temp.next;
        if (temp.next != null) temp.next.prev = temp.prev; else tail = temp.prev;
    }

    public List<MovieNode> searchByDirector(String director) {
        List<MovieNode> result = new ArrayList<>();
        MovieNode temp = head;
        while (temp != null) {
            if (temp.director.equals(director)) result.add(temp);
            temp = temp.next;
        }
        return result;
    }

    public List<MovieNode> searchByRating(double rating) {
        List<MovieNode> result = new ArrayList<>();
        MovieNode temp = head;
        while (temp != null) {
            if (temp.rating == rating) result.add(temp);
            temp = temp.next;
        }
        return result;
    }

    public void updateRating(String title, double newRating) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.title.equals(title)) temp.rating = newRating;
            temp = temp.next;
        }
    }

    public void displayForward() {
        MovieNode temp = head;
        while (temp != null) {
            System.out.println(temp.title + ", " + temp.director + ", " + temp.year + ", " + temp.rating);
            temp = temp.next;
        }
    }

    public void displayReverse() {
        MovieNode temp = tail;
        while (temp != null) {
            System.out.println(temp.title + ", " + temp.director + ", " + temp.year + ", " + temp.rating);
            temp = temp.prev;
        }
    }

    public static void main(String[] args) {
        MovieManagementDoublyLinkedList list = new MovieManagementDoublyLinkedList();
        list.addAtEnd("Inception", "Nolan", 2010, 8.8);
        list.addAtBeginning("Interstellar", "Nolan", 2014, 8.6);
        list.addAtPosition(2, "Memento", "Nolan", 2000, 8.4);
        list.displayForward();
        System.out.println("--- Reverse ---");
        list.displayReverse();
        System.out.println("--- After update and remove ---");
        list.updateRating("Memento", 9.0);
        list.removeByTitle("Inception");
        list.displayForward();
    }
} 