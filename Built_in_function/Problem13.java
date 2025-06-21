import java.util.*;
public class Problem13 {
    public double add(double a, double b) { return a + b; }
    public double subtract(double a, double b) { return a - b; }
    public double multiply(double a, double b) { return a * b; }
    public double divide(double a, double b) { return a / b; }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Problem13 p = new Problem13();
        System.out.println("Enter operation: 1=add 2=subtract 3=multiply 4=divide");
        int op = sc.nextInt();
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        if (op == 1) System.out.println(p.add(a, b));
        else if (op == 2) System.out.println(p.subtract(a, b));
        else if (op == 3) System.out.println(p.multiply(a, b));
        else if (op == 4) System.out.println(p.divide(a, b));
    }
} 