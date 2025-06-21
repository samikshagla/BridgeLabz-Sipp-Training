import java.util.*;
public class Problem11 {
    public int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
    public int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Problem11 p = new Problem11();
        System.out.println(p.gcd(a, b));
        System.out.println(p.lcm(a, b));
    }
} 