package LinkedList;

import java.util.Scanner;

class StudentNode {
    int rollNumber;
    String name;
    int age;
    String grade;
    StudentNode next;
    public StudentNode(int rollNumber, String name, int age, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

public class StudentRecordSinglyLinkedList {
    private StudentNode head;

    public void addAtBeginning(int roll, String name, int age, String grade) {
        StudentNode newNode = new StudentNode(roll, name, age, grade);
        newNode.next = head;
        head = newNode;
    }

    public void addAtEnd(int roll, String name, int age, String grade) {
        StudentNode newNode = new StudentNode(roll, name, age, grade);
        if (head == null) {
            head = newNode;
            return;
        }
        StudentNode temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }

    public void addAtPosition(int pos, int roll, String name, int age, String grade) {
        if (pos <= 1 || head == null) {
            addAtBeginning(roll, name, age, grade);
            return;
        }
        StudentNode temp = head;
        for (int i = 1; i < pos - 1 && temp.next != null; i++) temp = temp.next;
        StudentNode newNode = new StudentNode(roll, name, age, grade);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void deleteByRoll(int roll) {
        if (head == null) return;
        if (head.rollNumber == roll) {
            head = head.next;
            return;
        }
        StudentNode temp = head;
        while (temp.next != null && temp.next.rollNumber != roll) temp = temp.next;
        if (temp.next != null) temp.next = temp.next.next;
    }

    public StudentNode searchByRoll(int roll) {
        StudentNode temp = head;
        while (temp != null) {
            if (temp.rollNumber == roll) return temp;
            temp = temp.next;
        }
        return null;
    }

    public void updateGrade(int roll, String newGrade) {
        StudentNode node = searchByRoll(roll);
        if (node != null) node.grade = newGrade;
    }

    public void displayAll() {
        StudentNode temp = head;
        while (temp != null) {
            System.out.println("Roll: " + temp.rollNumber + ", Name: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        StudentRecordSinglyLinkedList list = new StudentRecordSinglyLinkedList();
        list.addAtEnd(1, "Alice", 20, "A");
        list.addAtBeginning(2, "Bob", 21, "B");
        list.addAtPosition(2, 3, "Charlie", 22, "C");
        list.displayAll();
        System.out.println("--- After update and delete ---");
        list.updateGrade(2, "A+");
        list.deleteByRoll(3);
        list.displayAll();
    }
} 