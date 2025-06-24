public class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "ABC Institute";
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
    public void displayCourseDetails() {
        System.out.println(courseName + " " + duration + " " + fee + " " + instituteName);
    }
    public static void updateInstituteName(String name) {
        instituteName = name;
    }
    public static void main(String[] args) {
        Course c1 = new Course("Java", 3, 5000);
        c1.displayCourseDetails();
        Course.updateInstituteName("XYZ Academy");
        Course c2 = new Course("Python", 2, 4000);
        c2.displayCourseDetails();
    }
} 