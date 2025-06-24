import java.util.*;
public class Employee {
    String name;
    int id;
    double salary;
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public void display() {
        System.out.println(name + " " + id + " " + salary);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int id = sc.nextInt();
        double salary = sc.nextDouble();
        Employee e = new Employee(name, id, salary);
        e.display();
    }
} 