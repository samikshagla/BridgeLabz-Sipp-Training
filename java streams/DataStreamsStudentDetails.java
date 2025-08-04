import java.io.*;

public class DataStreamsStudentDetails {
    public static void main(String[] args) {
        // Write student details
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("students.dat"))) {
            dos.writeInt(101);
            dos.writeUTF("Alice");
            dos.writeDouble(3.8);
            
            dos.writeInt(102);
            dos.writeUTF("Bob");
            dos.writeDouble(3.5);
            
            dos.writeInt(103);
            dos.writeUTF("Carol");
            dos.writeDouble(3.9);
            
            System.out.println("Student details written successfully!");
            
        } catch (IOException e) {
            System.out.println("Error writing data: " + e.getMessage());
        }
        
        // Read student details
        try (DataInputStream dis = new DataInputStream(new FileInputStream("students.dat"))) {
            System.out.println("Retrieved student details:");
            while (dis.available() > 0) {
                int rollNo = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();
                System.out.println("Roll: " + rollNo + ", Name: " + name + ", GPA: " + gpa);
            }
        } catch (IOException e) {
            System.out.println("Error reading data: " + e.getMessage());
        }
    }
} 