import java.util.*;
public class Problem12 {
    public double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
    public double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double f = sc.nextDouble();
        double c = sc.nextDouble();
        Problem12 p = new Problem12();
        System.out.println(p.fahrenheitToCelsius(f));
        System.out.println(p.celsiusToFahrenheit(c));
    }
} 