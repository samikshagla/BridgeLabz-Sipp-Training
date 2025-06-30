// Self Problem 5: University Management System
import java.util.*;

class Professor {
    private String name;
    public Professor(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

class CourseU {
    private String name;
    private Professor professor;
    private List<StudentU> students;
    public CourseU(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public void assignProfessor(Professor prof) {
        this.professor = prof;
        System.out.println(prof.getName() + " assigned to teach " + name);
    }
    public void enrollStudent(StudentU student) {
        if (!students.contains(student)) {
            students.add(student);
            System.out.println(student.getName() + " enrolled in " + name);
        }
    }
    public void showStudents() {
        System.out.println("Students in " + name + ":");
        for (StudentU s : students) {
            System.out.println(s.getName());
        }
    }
    public void showProfessor() {
        if (professor != null) {
            System.out.println("Professor for " + name + ": " + professor.getName());
        } else {
            System.out.println("No professor assigned for " + name);
        }
    }
}

class StudentU {
    private String name;
    private List<CourseU> courses;
    public StudentU(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public void enrollCourse(CourseU course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.enrollStudent(this);
        }
    }
    public void showCourses() {
        System.out.println(name + " is enrolled in:");
        for (CourseU c : courses) {
            System.out.println(c.getName());
        }
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Professor profA = new Professor("Dr. Alice");
        Professor profB = new Professor("Dr. Bob");
        CourseU math = new CourseU("Mathematics");
        CourseU cs = new CourseU("Computer Science");
        StudentU alice = new StudentU("Alice");
        StudentU bob = new StudentU("Bob");

        math.assignProfessor(profA);
        cs.assignProfessor(profB);

        alice.enrollCourse(math);
        alice.enrollCourse(cs);
        bob.enrollCourse(cs);

        math.showProfessor();
        cs.showProfessor();
        math.showStudents();
        cs.showStudents();
        alice.showCourses();
        bob.showCourses();
    }
} 