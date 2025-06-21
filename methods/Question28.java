import java.util.*;
public class Question28 {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) if (n % i == 0) return false;
        return true;
    }
    public static boolean isNeon(int n) {
        int sq = n * n, sum = 0;
        while (sq > 0) {
            sum += sq % 10;
            sq /= 10;
        }
        return sum == n;
    }
    public static boolean isSpy(int n) {
        int sum = 0, prod = 1, temp = n;
        while (temp > 0) {
            int d = temp % 10;
            sum += d;
            prod *= d;
            temp /= 10;
        }
        return sum == prod;
    }
    public static boolean isAutomorphic(int n) {
        int sq = n * n;
        String s = String.valueOf(n), sqs = String.valueOf(sq);
        return sqs.endsWith(s);
    }
    public static boolean isBuzz(int n) {
        return n % 7 == 0 || n % 10 == 7;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPrime(n));
        System.out.println(isNeon(n));
        System.out.println(isSpy(n));
        System.out.println(isAutomorphic(n));
        System.out.println(isBuzz(n));
    }
} 