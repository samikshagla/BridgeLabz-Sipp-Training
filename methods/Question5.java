import java.util.*;
public class Question5 {
    public static int[] findSmallestAndLargest(int a, int b, int c) {
        int min = a, max = a;
        if (b < min) min = b;
        if (c < min) min = c;
        if (b > max) max = b;
        if (c > max) max = c;
        return new int[]{min, max};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] res = findSmallestAndLargest(a, b, c);
        System.out.println(res[0] + " " + res[1]);
    }
} 