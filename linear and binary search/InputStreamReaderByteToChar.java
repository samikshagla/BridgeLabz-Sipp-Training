import java.io.*;

public class InputStreamReaderByteToChar {
    public static void main(String[] args) {
        String fileName = "sample.txt"; // Change to your file path
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "UTF-8"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
} 