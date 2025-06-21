import java.util.*;
public class Question23 {
    public boolean isPositive(int n) {
        return n > 0;
    }
    public boolean isEven(int n) {
        return n % 2 == 0;
    }
    public int compare(int a, int b) {
        if (a > b) return 1;
        if (a == b) return 0;
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) arr[i] = sc.nextInt();
        Question23 q = new Question23();
        for (int i = 0; i < 5; i++) {
            if (q.isPositive(arr[i])) {
                if (q.isEven(arr[i])) System.out.println("Even");
                else System.out.println("Odd");
            } else {
                System.out.println("Negative");
            }
        }
        int cmp = q.compare(arr[0], arr[4]);
        if (cmp == 0) System.out.println("Equal");
        else if (cmp == 1) System.out.println("Greater");
        else System.out.println("Less");
    }
} 