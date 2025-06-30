// Self Problem 1: School and Students with Courses (Association and Aggregation)
import java.util.*;

class Course {
    private String name;
    private List<Student> students;

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public void showEnrolledStudents() {
        System.out.println("Students enrolled in " + name + ":");
        for (Student s : students) {
            System.out.println(s.getName());
        }
    }
}

class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollInCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.enrollStudent(this);
        }
    }

    public void showCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course c : courses) {
            System.out.println(c.getName());
        }
    }
}

class School {
    private String name;
    private List<Student> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}

public class SchoolStudentsCourses {
    public static void main(String[] args) {
        School school = new School("Greenwood High");
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");
        Course math = new Course("Mathematics");
        Course sci = new Course("Science");

        school.addStudent(alice);
        school.addStudent(bob);

        alice.enrollInCourse(math);
        alice.enrollInCourse(sci);
        bob.enrollInCourse(math);

        alice.showCourses();
        bob.showCourses();
        math.showEnrolledStudents();
        sci.showEnrolledStudents();
    }
} 