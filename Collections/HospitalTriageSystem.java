package Collections;
import java.util.*;

class Patient implements Comparable<Patient> {
    String name;
    int severity;
    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
    @Override
    public int compareTo(Patient o) {
        return Integer.compare(o.severity, this.severity); // higher severity first
    }
    @Override
    public String toString() {
        return name + "(" + severity + ")";
    }
}

public class HospitalTriageSystem {
    public static void main(String[] args) {
        PriorityQueue<Patient> pq = new PriorityQueue<>();
        pq.add(new Patient("John", 3));
        pq.add(new Patient("Alice", 5));
        pq.add(new Patient("Bob", 2));
        System.out.print("Treatment order: ");
        while (!pq.isEmpty()) {
            System.out.print(pq.remove() + " ");
        }
    }
} 