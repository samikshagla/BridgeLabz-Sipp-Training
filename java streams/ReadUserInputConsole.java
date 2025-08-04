import java.io.*;

public class ReadUserInputConsole {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             FileWriter fw = new FileWriter("user_info.txt")) {
            
            System.out.print("Enter your name: ");
            String name = br.readLine();
            
            System.out.print("Enter your age: ");
            int age = Integer.parseInt(br.readLine());
            
            System.out.print("Enter your favorite programming language: ");
            String language = br.readLine();
            
            // Write to file
            fw.write("Name: " + name + "\n");
            fw.write("Age: " + age + "\n");
            fw.write("Favorite Language: " + language + "\n");
            
            System.out.println("Information saved to user_info.txt");
            
        } catch (IOException e) {
            System.out.println("Error reading input or writing file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid age format. Please enter a number.");
        }
    }
} 