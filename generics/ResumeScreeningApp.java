import java.util.*;
abstract class JobRole {  
    String name;  

    public JobRole(String name) {  
        this.name = name;  
    }  
}  


class SoftwareEngineer extends JobRole {  
    public SoftwareEngineer() {  
        super("Software Engineer");  
    }  
}  

class DataScientist extends JobRole {  
    public DataScientist() {  
        super("Data Scientist");  
    }  
}  

class ProductManager extends JobRole {  
    public ProductManager() {  
        super("Product Manager");  
    }  
}  


class Resume<T extends JobRole> {  
    private T jobRole;  

    public Resume(T jobRole) {  
        this.jobRole = jobRole;  
    }  

    public T getJobRole() {  
        return jobRole;  
    }  
}  


class ResumeScreening {  
    public void screenResumes(List<? extends JobRole> resumes) {  
        for (JobRole resume : resumes) {  
            System.out.println("Screening for " + resume.name);  
        }  
    }  
}  

 
public class ResumeScreeningApp {  
    public static void main(String[] args) {  
        Resume<SoftwareEngineer> softwareEngineerResume = new Resume<>(new SoftwareEngineer());  
        Resume<DataScientist> dataScientistResume = new Resume<>(new DataScientist());  
        Resume<ProductManager> productManagerResume = new Resume<>(new ProductManager());  

        List<JobRole> resumes = new ArrayList<>();  
        resumes.add(softwareEngineerResume.getJobRole());  
        resumes.add(dataScientistResume.getJobRole());  
        resumes.add(productManagerResume.getJobRole());  

        ResumeScreening screening = new ResumeScreening();  
        screening.screenResumes(resumes);  
    }  
}