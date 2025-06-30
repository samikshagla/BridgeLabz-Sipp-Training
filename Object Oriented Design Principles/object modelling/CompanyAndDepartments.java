// Problem 3: Company and Departments (Composition)
import java.util.ArrayList;
import java.util.List;

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    public void showEmployees() {
        System.out.println("Employees in " + name + ":");
        for (Employee emp : employees) {
            System.out.println(emp.getName());
        }
    }
}

class Company {
    private String name;
    private List<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department dept) {
        departments.add(dept);
    }

    public void showDepartments() {
        System.out.println("Departments in " + name + ":");
        for (Department dept : departments) {
            System.out.println(dept);
            dept.showEmployees();
        }
    }
}

public class CompanyAndDepartments {
    public static void main(String[] args) {
        Company company = new Company("TechCorp");
        Department dev = new Department("Development");
        Department hr = new Department("HR");

        dev.addEmployee(new Employee("Alice"));
        dev.addEmployee(new Employee("Bob"));
        hr.addEmployee(new Employee("Carol"));

        company.addDepartment(dev);
        company.addDepartment(hr);

        company.showDepartments();
        // When company is deleted, departments and employees are also deleted (composition)
    }
} 