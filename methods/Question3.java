import java.util.*;
public class Question3 {
    public double[] calculateTrigonometricFunctions(double angle) {
        double rad = Math.toRadians(angle);
        double[] res = new double[3];
        res[0] = Math.sin(rad);
        res[1] = Math.cos(rad);
        res[2] = Math.tan(rad);
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double angle = sc.nextDouble();
        Question3 q = new Question3();
        double[] res = q.calculateTrigonometricFunctions(angle);
        for (double v : res) System.out.println(v);
    }
} 