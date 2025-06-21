import java.util.*;
public class Question13 {
    public int sumRecursive(int n) {
        if (n <= 1) return n;
        return n + sumRecursive(n - 1);
    }
    public int sumFormula(int n) {
        return n * (n + 1) / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Question13 q = new Question13();
        int rec = q.sumRecursive(n);
        int form = q.sumFormula(n);
        System.out.println(rec == form);
    }
} 