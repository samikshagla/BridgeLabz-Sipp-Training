import java.util.*;
public class Question1 {
    public double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temperature * Math.pow(windSpeed, 0.16);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double t = sc.nextDouble();
        double w = sc.nextDouble();
        Question1 q = new Question1();
        double result = q.calculateWindChill(t, w);
        System.out.println(result);
    }
} 