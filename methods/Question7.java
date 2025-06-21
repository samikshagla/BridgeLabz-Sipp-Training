import java.util.*;
public class Question7 {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chocolates = sc.nextInt();
        int children = sc.nextInt();
        int[] res = findRemainderAndQuotient(chocolates, children);
        System.out.println(res[0] + " " + res[1]);
    }
} 