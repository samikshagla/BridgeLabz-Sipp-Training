import java.util.*;
public class Question31 {
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
    public static int[] reverseArray(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++) rev[i] = arr[arr.length - 1 - i];
        return rev;
    }
    public static boolean compareArrays(int[] a, int[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) if (a[i] != b[i]) return false;
        return true;
    }
    public static boolean isPalindrome(int n) {
        int[] arr = digitsArray(n);
        int[] rev = reverseArray(arr);
        return compareArrays(arr, rev);
    }
    public static boolean isDuck(int n) {
        int[] arr = digitsArray(n);
        for (int i = 1; i < arr.length; i++) if (arr[i] == 0) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = digitsArray(n);
        int[] rev = reverseArray(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(rev));
        System.out.println(compareArrays(arr, rev));
        System.out.println(isPalindrome(n));
        System.out.println(isDuck(n));
    }
} 