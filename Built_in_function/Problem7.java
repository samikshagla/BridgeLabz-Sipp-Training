import java.util.*;
public class Problem7 {
    public boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) if (n % i == 0) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Problem7 p = new Problem7();
        System.out.println(p.isPrime(n));
    }
} 