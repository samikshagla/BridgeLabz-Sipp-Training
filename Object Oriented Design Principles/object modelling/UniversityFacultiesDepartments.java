// Self Problem 2: University with Faculties and Departments (Composition and Aggregation)
import java.util.*;

class Faculty {
    private String name;
    public Faculty(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

class DepartmentU {
    private String name;
    public DepartmentU(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

class University {
    private String name;
    private List<DepartmentU> departments;
    private List<Faculty> faculties;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    public void addDepartment(DepartmentU dept) {
        departments.add(dept);
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void showDepartments() {
        System.out.println("Departments in " + name + ":");
        for (DepartmentU d : departments) {
            System.out.println(d.getName());
        }
    }

    public void showFaculties() {
        System.out.println("Faculties in " + name + ":");
        for (Faculty f : faculties) {
            System.out.println(f.getName());
        }
    }
}

public class UniversityFacultiesDepartments {
    public static void main(String[] args) {
        University uni = new University("Global University");
        DepartmentU cs = new DepartmentU("Computer Science");
        DepartmentU math = new DepartmentU("Mathematics");
        Faculty profA = new Faculty("Prof. Alice");
        Faculty profB = new Faculty("Prof. Bob");

        uni.addDepartment(cs);
        uni.addDepartment(math);
        uni.addFaculty(profA);
        uni.addFaculty(profB);

        uni.showDepartments();
        uni.showFaculties();
        // Deleting university would delete all departments (composition), but faculties can exist independently (aggregation)
    }
} 