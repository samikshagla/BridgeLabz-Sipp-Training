// Self Problem 3: Hospital, Doctors, and Patients (Association and Communication)
import java.util.*;

class Patient {
    private String name;
    public Patient(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

class Doctor {
    private String name;
    private List<Patient> patients;
    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public void consult(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
        }
        System.out.println("Dr. " + name + " is consulting patient " + patient.getName());
    }
    public void showPatients() {
        System.out.println("Patients of Dr. " + name + ":");
        for (Patient p : patients) {
            System.out.println(p.getName());
        }
    }
}

class Hospital {
    private String name;
    private List<Doctor> doctors;
    private List<Patient> patients;
    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }
    public void addPatient(Patient patient) {
        patients.add(patient);
    }
}

public class HospitalDoctorsPatients {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Hospital");
        Doctor doc1 = new Doctor("Smith");
        Doctor doc2 = new Doctor("Jones");
        Patient pat1 = new Patient("Alice");
        Patient pat2 = new Patient("Bob");

        hospital.addDoctor(doc1);
        hospital.addDoctor(doc2);
        hospital.addPatient(pat1);
        hospital.addPatient(pat2);

        doc1.consult(pat1);
        doc1.consult(pat2);
        doc2.consult(pat2);

        doc1.showPatients();
        doc2.showPatients();
    }
} 