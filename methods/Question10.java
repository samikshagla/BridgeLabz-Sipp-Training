import java.util.*;
public class Question10 {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] res = findRemainderAndQuotient(a, b);
        System.out.println(res[0] + " " + res[1]);
    }
} 