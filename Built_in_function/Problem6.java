import java.util.*;
public class Problem6 {
    public int maxOfThree(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Problem6 p = new Problem6();
        System.out.println(p.maxOfThree(a, b, c));
    }
} 