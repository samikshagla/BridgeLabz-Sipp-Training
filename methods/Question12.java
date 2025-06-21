import java.util.*;
public class Question12 {
    public int[] findFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) count++;
        int[] factors = new int[count];
        int idx = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) factors[idx++] = i;
        return factors;
    }
    public int sum(int[] arr) {
        int s = 0;
        for (int v : arr) s += v;
        return s;
    }
    public int product(int[] arr) {
        int p = 1;
        for (int v : arr) p *= v;
        return p;
    }
    public int sumOfSquares(int[] arr) {
        int s = 0;
        for (int v : arr) s += (int)Math.pow(v, 2);
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Question12 q = new Question12();
        int[] factors = q.findFactors(n);
        System.out.println(Arrays.toString(factors));
        System.out.println(q.sum(factors));
        System.out.println(q.sumOfSquares(factors));
        System.out.println(q.product(factors));
    }
} 