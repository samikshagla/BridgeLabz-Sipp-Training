package LinkedList;

import java.util.*;

class TaskNode {
    int taskId;
    String taskName;
    int priority;
    String dueDate;
    TaskNode next;
    public TaskNode(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

public class TaskSchedulerCircularLinkedList {
    private TaskNode head = null;
    private TaskNode tail = null;
    private TaskNode current = null;

    public void addAtBeginning(int id, String name, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(id, name, priority, dueDate);
        if (head == null) {
            head = tail = newNode;
            newNode.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
    }

    public void addAtEnd(int id, String name, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(id, name, priority, dueDate);
        if (head == null) {
            head = tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    public void addAtPosition(int pos, int id, String name, int priority, String dueDate) {
        if (pos <= 1 || head == null) {
            addAtBeginning(id, name, priority, dueDate);
            return;
        }
        TaskNode temp = head;
        for (int i = 1; i < pos - 1 && temp.next != head; i++) temp = temp.next;
        TaskNode newNode = new TaskNode(id, name, priority, dueDate);
        newNode.next = temp.next;
        temp.next = newNode;
        if (temp == tail) tail = newNode;
    }

    public void removeById(int id) {
        if (head == null) return;
        if (head.taskId == id) {
            if (head == tail) { head = tail = null; return; }
            head = head.next;
            tail.next = head;
            return;
        }
        TaskNode temp = head;
        while (temp.next != head && temp.next.taskId != id) temp = temp.next;
        if (temp.next.taskId == id) {
            if (temp.next == tail) tail = temp;
            temp.next = temp.next.next;
        }
    }

    public TaskNode searchByPriority(int priority) {
        if (head == null) return null;
        TaskNode temp = head;
        do {
            if (temp.priority == priority) return temp;
            temp = temp.next;
        } while (temp != head);
        return null;
    }

    public void displayAll() {
        if (head == null) return;
        TaskNode temp = head;
        do {
            System.out.println("ID: " + temp.taskId + ", Name: " + temp.taskName + ", Priority: " + temp.priority + ", Due: " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    public void viewCurrentAndMoveNext() {
        if (current == null) current = head;
        if (current != null) {
            System.out.println("Current Task: " + current.taskName);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        TaskSchedulerCircularLinkedList scheduler = new TaskSchedulerCircularLinkedList();
        scheduler.addAtEnd(1, "Task1", 1, "2024-07-10");
        scheduler.addAtEnd(2, "Task2", 2, "2024-07-11");
        scheduler.addAtBeginning(3, "Task3", 3, "2024-07-12");
        scheduler.displayAll();
        System.out.println("--- View and Move Next ---");
        scheduler.viewCurrentAndMoveNext();
        scheduler.viewCurrentAndMoveNext();
        System.out.println("--- Remove Task2 and Display ---");
        scheduler.removeById(2);
        scheduler.displayAll();
    }
} 