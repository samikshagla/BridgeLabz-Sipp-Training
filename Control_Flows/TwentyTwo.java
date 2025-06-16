import java.util.Scanner;

public class TwentyTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number less than 100: ");
        int number = sc.nextInt();

        if (number > 0 && number < 100) {
            int counter = 1;
            while (counter < 100) {
                if (counter % number == 0) {
                    System.out.println(counter);
                }
                counter++;
            }
        } else {
            System.out.println("Invalid input. Enter a positive number less than 100.");
        }
    }
}

