import java.io.*;

public class FileReaderCountWord {
    public static void main(String[] args) {
        String fileName = "sample.txt"; // Change to your file path
        String targetWord = "the"; // Change to your target word
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\W+");
                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) {
                        count++;
                    }
                }
            }
            System.out.println("Occurrences of '" + targetWord + "': " + count);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
} 