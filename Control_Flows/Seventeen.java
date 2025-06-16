import java.util.Scanner;

public class Seventeen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        if (number > 0) {
            System.out.print("Factors of " + number + " are: ");
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.println("The number " + number + " is not a positive integer.");
        }
    }
}

