import java.io.*;
import java.util.*;

class Employee implements Serializable {
    private int id;
    private String name;
    private String department;
    private double salary;
    
    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    
    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', department='" + department + "', salary=" + salary + "}";
    }
}

public class SerializationEmployee {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Alice", "HR", 50000),
            new Employee(2, "Bob", "IT", 60000),
            new Employee(3, "Carol", "Finance", 55000)
        );
        
        // Serialize
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employees.dat"))) {
            oos.writeObject(employees);
            System.out.println("Employees serialized successfully!");
        } catch (IOException e) {
            System.out.println("Error serializing: " + e.getMessage());
        }
        
        // Deserialize
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employees.dat"))) {
            @SuppressWarnings("unchecked")
            List<Employee> retrievedEmployees = (List<Employee>) ois.readObject();
            System.out.println("Retrieved employees:");
            for (Employee emp : retrievedEmployees) {
                System.out.println(emp);
            }
        } catch (IOException e) {
            System.out.println("Error deserializing: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }
    }
} 