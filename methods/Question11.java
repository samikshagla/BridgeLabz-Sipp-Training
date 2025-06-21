import java.util.*;
public class Question11 {
    public int checkNumber(int n) {
        if (n > 0) return 1;
        if (n < 0) return -1;
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Question11 q = new Question11();
        int res = q.checkNumber(n);
        System.out.println(res);
    }
} 