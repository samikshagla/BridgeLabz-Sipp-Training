import java.util.*;
public class Student {
    String name;
    int rollNumber;
    double marks;
    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    public String calculateGrade() {
        if (marks >= 90) return "A";
        if (marks >= 80) return "B";
        if (marks >= 70) return "C";
        if (marks >= 60) return "D";
        return "F";
    }
    public void display() {
        System.out.println(name + " " + rollNumber + " " + marks + " " + calculateGrade());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int roll = sc.nextInt();
        double marks = sc.nextDouble();
        Student s = new Student(name, roll, marks);
        s.display();
    }
} 