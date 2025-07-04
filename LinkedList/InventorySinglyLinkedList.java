package LinkedList;

import java.util.*;

class ItemNode {
    String itemName;
    int itemId;
    int quantity;
    double price;
    ItemNode next;
    public ItemNode(String itemName, int itemId, int quantity, double price) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

public class InventorySinglyLinkedList {
    private ItemNode head;

    public void addAtBeginning(String name, int id, int qty, double price) {
        ItemNode newNode = new ItemNode(name, id, qty, price);
        newNode.next = head;
        head = newNode;
    }

    public void addAtEnd(String name, int id, int qty, double price) {
        ItemNode newNode = new ItemNode(name, id, qty, price);
        if (head == null) { head = newNode; return; }
        ItemNode temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }

    public void addAtPosition(int pos, String name, int id, int qty, double price) {
        if (pos <= 1 || head == null) { addAtBeginning(name, id, qty, price); return; }
        ItemNode temp = head;
        for (int i = 1; i < pos - 1 && temp.next != null; i++) temp = temp.next;
        ItemNode newNode = new ItemNode(name, id, qty, price);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void removeById(int id) {
        if (head == null) return;
        if (head.itemId == id) { head = head.next; return; }
        ItemNode temp = head;
        while (temp.next != null && temp.next.itemId != id) temp = temp.next;
        if (temp.next != null) temp.next = temp.next.next;
    }

    public void updateQuantity(int id, int newQty) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemId == id) temp.quantity = newQty;
            temp = temp.next;
        }
    }

    public ItemNode searchById(int id) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemId == id) return temp;
            temp = temp.next;
        }
        return null;
    }

    public ItemNode searchByName(String name) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemName.equals(name)) return temp;
            temp = temp.next;
        }
        return null;
    }

    public double totalInventoryValue() {
        double sum = 0;
        ItemNode temp = head;
        while (temp != null) {
            sum += temp.price * temp.quantity;
            temp = temp.next;
        }
        return sum;
    }

    public void sortByName(boolean ascending) {
        head = mergeSort(head, ascending ? Comparator.comparing(n -> n.itemName) : Comparator.comparing((ItemNode n) -> n.itemName).reversed());
    }
    public void sortByPrice(boolean ascending) {
        head = mergeSort(head, ascending ? Comparator.comparingDouble(n -> n.price) : Comparator.comparingDouble((ItemNode n) -> n.price).reversed());
    }
    private ItemNode mergeSort(ItemNode node, Comparator<ItemNode> cmp) {
        if (node == null || node.next == null) return node;
        ItemNode mid = getMiddle(node);
        ItemNode nextOfMid = mid.next;
        mid.next = null;
        ItemNode left = mergeSort(node, cmp);
        ItemNode right = mergeSort(nextOfMid, cmp);
        return merge(left, right, cmp);
    }
    private ItemNode merge(ItemNode a, ItemNode b, Comparator<ItemNode> cmp) {
        if (a == null) return b;
        if (b == null) return a;
        if (cmp.compare(a, b) <= 0) {
            a.next = merge(a.next, b, cmp);
            return a;
        } else {
            b.next = merge(a, b.next, cmp);
            return b;
        }
    }
    private ItemNode getMiddle(ItemNode node) {
        if (node == null) return node;
        ItemNode slow = node, fast = node.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public void displayAll() {
        ItemNode temp = head;
        while (temp != null) {
            System.out.println(temp.itemName + ", ID: " + temp.itemId + ", Qty: " + temp.quantity + ", Price: " + temp.price);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        InventorySinglyLinkedList inv = new InventorySinglyLinkedList();
        inv.addAtEnd("Pen", 1, 100, 5);
        inv.addAtBeginning("Book", 2, 50, 20);
        inv.addAtPosition(2, "Pencil", 3, 200, 2);
        inv.displayAll();
        System.out.println("Total Value: " + inv.totalInventoryValue());
        System.out.println("--- After sort by price desc ---");
        inv.sortByPrice(false);
        inv.displayAll();
    }
} 