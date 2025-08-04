import java.io.*;

public class FilterStreamsCaseConversion {
    public static void main(String[] args) {
        String sourceFile = "input.txt";
        String destFile = "output.txt";
        
        try (BufferedReader br = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(destFile))) {
            
            String line;
            while ((line = br.readLine()) != null) {
                String lowercaseLine = line.toLowerCase();
                bw.write(lowercaseLine);
                bw.newLine();
            }
            System.out.println("File converted successfully!");
            
        } catch (IOException e) {
            System.out.println("Error processing file: " + e.getMessage());
        }
    }
} 