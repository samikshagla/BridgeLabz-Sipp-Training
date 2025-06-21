import java.util.*;
public class Question4 {
    public double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return 5000.0 / perimeter;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        Question4 q = new Question4();
        double rounds = q.calculateRounds(a, b, c);
        System.out.println(rounds);
    }
} 