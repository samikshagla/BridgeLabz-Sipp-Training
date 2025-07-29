 import java.util.ArrayList;  
import java.util.List;  
abstract class CourseType {  
    String title;  

    public CourseType(String title) {  
        this.title = title;  
    }  
}  
 
class ExamCourse extends CourseType {  
    public ExamCourse(String title) {  
        super(title);  
    }  
}  

class AssignmentCourse extends CourseType {  
    public AssignmentCourse(String title) {  
        super(title);  
    }  
}  

class ResearchCourse extends CourseType {  
    public ResearchCourse(String title) {  
        super(title);  
    }  
}  

 
class Course<T extends CourseType> {  
    private T courseType;  

    public Course(T courseType) {  
        this.courseType = courseType;  
    }  

    public T getCourseType() {  
        return courseType;  
    }  
}  

  
public class CourseManagement {  
    public static void main(String[] args) {  
        Course<ExamCourse> examCourse = new Course<>(new ExamCourse("Mathematics"));  
        Course<AssignmentCourse> assignmentCourse = new Course<>(new AssignmentCourse("History"));  

        List<Course<? extends CourseType>> courseList = new ArrayList<>();  
        courseList.add(examCourse);  
        courseList.add(assignmentCourse);  

        for (Course<? extends CourseType> course : courseList) {  
            System.out.println(course.getCourseType().title);  
        }  
    }  
}