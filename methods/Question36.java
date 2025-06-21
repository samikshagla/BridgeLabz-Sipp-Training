import java.util.*;
public class Question16 {
    public int[] findFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) count++;
        int[] factors = new int[count];
        int idx = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) factors[idx++] = i;
        return factors;
    }
    public int greatestFactor(int[] arr) {
        int max = arr[0];
        for (int v : arr) if (v > max) max = v;
        return max;
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
    public int productOfCubes(int[] arr) {
        int p = 1;
        for (int v : arr) p *= Math.pow(v, 3);
        return p;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Question16 q = new Question16();
        int[] factors = q.findFactors(n);
        System.out.println(Arrays.toString(factors));
        System.out.println(q.greatestFactor(factors));
        System.out.println(q.sum(factors));
        System.out.println(q.product(factors));
        System.out.println(q.productOfCubes(factors));
    }
} 