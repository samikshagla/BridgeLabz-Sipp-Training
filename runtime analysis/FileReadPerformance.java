import java.io.*;

public class FileReadPerformance {
    public static void main(String[] args) {
        String fileName = "largefile.txt"; // Change to your file path
        // FileReader
        long startFR = System.nanoTime();
        int countFR = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            while (br.readLine() != null) countFR++;
        } catch (IOException e) {
            System.out.println("FileReader error: " + e.getMessage());
        }
        long endFR = System.nanoTime();
        System.out.println("FileReader read lines: " + countFR + ", Time: " + (endFR - startFR) / 1_000_000.0 + " ms");

        // InputStreamReader
        long startISR = System.nanoTime();
        int countISR = 0;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "UTF-8"))) {
            while (br.readLine() != null) countISR++;
        } catch (IOException e) {
            System.out.println("InputStreamReader error: " + e.getMessage());
        }
        long endISR = System.nanoTime();
        System.out.println("InputStreamReader read lines: " + countISR + ", Time: " + (endISR - startISR) / 1_000_000.0 + " ms");
    }
} 