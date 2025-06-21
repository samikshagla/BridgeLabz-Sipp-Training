import java.util.*;
public class Question35 {
    public double euclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    public double[] lineEquation(double x1, double y1, double x2, double y2) {
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        return new double[]{m, b};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        Question35 q = new Question35();
        System.out.println(q.euclideanDistance(x1, y1, x2, y2));
        double[] eq = q.lineEquation(x1, y1, x2, y2);
        System.out.println("Slope: " + eq[0] + ", Intercept: " + eq[1]);
    }
} 