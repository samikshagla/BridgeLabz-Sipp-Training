import java.io.*;

public class InputStreamReaderUserInputToFile {
    public static void main(String[] args) {
        String fileName = "user_input.txt";
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            String line;
            System.out.println("Enter text (type 'exit' to finish):");
            while (!(line = br.readLine()).equalsIgnoreCase("exit")) {
                bw.write(line);
                bw.newLine();
            }
            System.out.println("Input saved to " + fileName);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
