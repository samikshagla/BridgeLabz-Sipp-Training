import java.util.*;
public class Question2 {
    public int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Question2 q = new Question2();
        int result = q.calculateHandshakes(n);
        System.out.println(result);
    }
} 