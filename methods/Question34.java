import java.util.*;
public class Question34 {
    public static int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }
    public static int[] digitsArray(int n) {
        int len = countDigits(n);
        int[] arr = new int[len];
        for (int i = len - 1; i >= 0; i--) {
            arr[i] = n % 10;
            n /= 10;
        }
        return arr;
    }
    public static boolean isDuck(int n) {
        int[] arr = digitsArray(n);
        for (int i = 1; i < arr.length; i++) if (arr[i] == 0) return true;
        return false;
    }
    public static boolean isArmstrong(int n) {
        int[] arr = digitsArray(n);
        int sum = 0, len = arr.length;
        for (int v : arr) sum += Math.pow(v, len);
        return sum == n;
    }
    public static int[] largestTwo(int[] arr) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int v : arr) {
            if (v > max1) { max2 = max1; max1 = v; }
            else if (v > max2 && v != max1) max2 = v;
        }
        return new int[]{max1, max2};
    }
    public static int[] smallestTwo(int[] arr) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int v : arr) {
            if (v < min1) { min2 = min1; min1 = v; }
            else if (v < min2 && v != min1) min2 = v;
        }
        return new int[]{min1, min2};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = digitsArray(n);
        System.out.println(countDigits(n));
        System.out.println(isDuck(n));
        System.out.println(isArmstrong(n));
        int[] l2 = largestTwo(arr);
        int[] s2 = smallestTwo(arr);
        System.out.println(l2[0] + " " + l2[1]);
        System.out.println(s2[0] + " " + s2[1]);
    }
} 