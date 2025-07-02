package Encapsulation_Polymorphism_interface_Abstract_class;

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

abstract class Patient {
    private int patientId;
    private String name;
    private int age;
    private String diagnosis;
    private StringBuilder medicalHistory = new StringBuilder();

    public Patient(int patientId, String name, int age, String diagnosis) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    public int getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }
    protected String getDiagnosis() { return diagnosis; }

    public void getPatientDetails() {
        System.out.println("ID: " + patientId + ", Name: " + name + ", Age: " + age);
    }

    public abstract double calculateBill();
}

class InPatient extends Patient implements MedicalRecord {
    private double dailyRate;
    private int daysAdmitted;
    public InPatient(int patientId, String name, int age, String diagnosis, double dailyRate, int daysAdmitted) {
        super(patientId, name, age, diagnosis);
        this.dailyRate = dailyRate;
        this.daysAdmitted = daysAdmitted;
    }
    @Override
    public double calculateBill() { return dailyRate * daysAdmitted; }
    @Override
    public void addRecord(String record) { System.out.println("InPatient Record Added: " + record); }
    @Override
    public void viewRecords() { System.out.println("Viewing InPatient Records"); }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    public OutPatient(int patientId, String name, int age, String diagnosis, double consultationFee) {
        super(patientId, name, age, diagnosis);
        this.consultationFee = consultationFee;
    }
    @Override
    public double calculateBill() { return consultationFee; }
    @Override
    public void addRecord(String record) { System.out.println("OutPatient Record Added: " + record); }
    @Override
    public void viewRecords() { System.out.println("Viewing OutPatient Records"); }
}

public class HospitalPatientManagement {
    public static void main(String[] args) {
        Patient[] patients = {
            new InPatient(1, "Alice", 30, "Fever", 2000, 3),
            new OutPatient(2, "Bob", 25, "Cold", 500)
        };
        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Bill: " + p.calculateBill());
            if (p instanceof MedicalRecord) {
                ((MedicalRecord)p).addRecord("Sample record");
                ((MedicalRecord)p).viewRecords();
            }
            System.out.println();
        }
    }
} 