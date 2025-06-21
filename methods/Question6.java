import java.util.*;
public class Question6 {
    public int sumNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Question6 q = new Question6();
        int result = q.sumNaturalNumbers(n);
        System.out.println(result);
    }
} 