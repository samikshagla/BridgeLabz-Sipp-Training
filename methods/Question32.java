import java.util.*;
public class Question32 {
    public int sum(int[] arr) {
        int s = 0;
        for (int v : arr) s += v;
        return s;
    }
    public double mean(int[] arr) {
        return sum(arr) / (double)arr.length;
    }
    public int min(int[] arr) {
        int m = arr[0];
        for (int v : arr) if (v < m) m = v;
        return m;
    }
    public int max(int[] arr) {
        int m = arr[0];
        for (int v : arr) if (v > m) m = v;
        return m;
    }
    public static void main(String[] args) {
        int[] heights = new int[11];
        for (int i = 0; i < 11; i++) heights[i] = 150 + (int)(Math.random() * 101);
        Question32 q = new Question32();
        System.out.println("Shortest: " + q.min(heights));
        System.out.println("Tallest: " + q.max(heights));
        System.out.println("Mean: " + q.mean(heights));
    }
} 