import java.util.Scanner;
public class Fourteen{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for a: ");
        double a = sc.nextDouble();
        System.out.print("Enter value for b: ");
        double b = sc.nextDouble();
        System.out.print("Enter value for c: ");
        double c = sc.nextDouble();
        double result1 = a + b * c;       
        double result2 = a * b + c;       
        double result3 = c + a / b;       
        double result4 = a % b + c;       
        System.out.printf("The results of Double Operations are:\n");
        System.out.printf("a + b * c = %.2f\n", result1);
        System.out.printf("a * b + c = %.2f\n", result2);
        System.out.printf("c + a / b = %.2f\n", result3);
        System.out.printf("a %% b + c = %.2f\n", result4); 
    }
}

