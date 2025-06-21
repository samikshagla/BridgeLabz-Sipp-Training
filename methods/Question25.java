import java.util.*;
public class Question25 {
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
    public static int sumDigits(int[] arr) {
        int s = 0;
        for (int v : arr) s += v;
        return s;
    }
    public static int sumSquaresDigits(int[] arr) {
        int s = 0;
        for (int v : arr) s += v * v;
        return s;
    }
    public static boolean isHarshad(int n) {
        int[] arr = digitsArray(n);
        int sum = sumDigits(arr);
        return n % sum == 0;
    }
    public static int[][] digitFrequency(int n) {
        int[] arr = digitsArray(n);
        int[] freq = new int[10];
        for (int v : arr) freq[v]++;
        int count = 0;
        for (int f : freq) if (f > 0) count++;
        int[][] res = new int[count][2];
        int idx = 0;
        for (int i = 0; i < 10; i++) if (freq[i] > 0) { res[idx][0] = i; res[idx][1] = freq[i]; idx++; }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = digitsArray(n);
        System.out.println(countDigits(n));
        System.out.println(Arrays.toString(arr));
        System.out.println(sumDigits(arr));
        System.out.println(sumSquaresDigits(arr));
        System.out.println(isHarshad(n));
        int[][] freq = digitFrequency(n);
        for (int[] row : freq) System.out.println(row[0] + " " + row[1]);
    }
} 