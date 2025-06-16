import java.util.Scanner;

public class ThirtyNine{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        int count = 0;
        int originalNumber = Math.abs(number); 
        if (originalNumber == 0) {
            count = 1; 
        } else {
            while (originalNumber != 0) {
                originalNumber = originalNumber / 10; 
                count++; 
            }
        }
        System.out.println("Number of digits: " + count);
    }
}
