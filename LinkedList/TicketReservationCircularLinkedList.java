package LinkedList;

import java.util.*;

class TicketNode {
    int ticketId;
    String customerName;
    String movieName;
    String seatNumber;
    String bookingTime;
    TicketNode next;
    public TicketNode(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}

public class TicketReservationCircularLinkedList {
    private TicketNode head = null, tail = null;

    public void addAtEnd(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        TicketNode newNode = new TicketNode(ticketId, customerName, movieName, seatNumber, bookingTime);
        if (head == null) {
            head = tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    public void removeByTicketId(int ticketId) {
        if (head == null) return;
        if (head.ticketId == ticketId) {
            if (head == tail) { head = tail = null; return; }
            head = head.next;
            tail.next = head;
            return;
        }
        TicketNode temp = head;
        while (temp.next != head && temp.next.ticketId != ticketId) temp = temp.next;
        if (temp.next.ticketId == ticketId) {
            if (temp.next == tail) tail = temp;
            temp.next = temp.next.next;
        }
    }

    public void displayAll() {
        if (head == null) return;
        TicketNode temp = head;
        do {
            System.out.println("TicketID: " + temp.ticketId + ", Customer: " + temp.customerName + ", Movie: " + temp.movieName + ", Seat: " + temp.seatNumber + ", Time: " + temp.bookingTime);
            temp = temp.next;
        } while (temp != head);
    }

    public List<TicketNode> searchByCustomerOrMovie(String key) {
        List<TicketNode> result = new ArrayList<>();
        if (head == null) return result;
        TicketNode temp = head;
        do {
            if (temp.customerName.equals(key) || temp.movieName.equals(key)) result.add(temp);
            temp = temp.next;
        } while (temp != head);
        return result;
    }

    public int countTickets() {
        if (head == null) return 0;
        int count = 0;
        TicketNode temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        return count;
    }

    public static void main(String[] args) {
        TicketReservationCircularLinkedList tr = new TicketReservationCircularLinkedList();
        tr.addAtEnd(1, "Alice", "Inception", "A1", "10:00");
        tr.addAtEnd(2, "Bob", "Interstellar", "B2", "11:00");
        tr.addAtEnd(3, "Charlie", "Inception", "A2", "10:05");
        tr.displayAll();
        System.out.println("--- After remove ---");
        tr.removeByTicketId(2);
        tr.displayAll();
        System.out.println("Tickets for Inception: " + tr.searchByCustomerOrMovie("Inception").size());
        System.out.println("Total Tickets: " + tr.countTickets());
    }
} 