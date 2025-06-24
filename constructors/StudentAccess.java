class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }
    public double getCGPA() {
        return CGPA;
    }
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
}
class PostgraduateStudent extends Student {
    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }
    public void display() {
        System.out.println(rollNumber + " " + name + " " + getCGPA());
    }
}
public class StudentAccess {
    public static void main(String[] args) {
        PostgraduateStudent s = new PostgraduateStudent(1, "Alice", 9.2);
        s.display();
        s.setCGPA(9.5);
        s.display();
    }
} 