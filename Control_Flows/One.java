import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        double number;
        System.out.println("Enter numbers to sum (enter 0 to stop):");
        while (true) {
            System.out.print("Enter number: ");
            number = sc.nextDouble();
            if (number == 0) {
                break;
            }
            total += number;
        }
        System.out.printf("The total sum is %.2f\n", total);
    }
}
