import java.util.Arrays;
import java.util.Random;

public class SearchPerformanceComparison {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 1000000};
        Random rand = new Random();
        for (int size : sizes) {
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) arr[i] = i;
            int target = rand.nextInt(size);

            // Linear Search
            long startLS = System.nanoTime();
            linearSearch(arr, target);
            long endLS = System.nanoTime();
            System.out.println("Linear Search - Size: " + size + ", Time: " + (endLS - startLS) / 1_000_000.0 + " ms");

            // Binary Search (array is already sorted)
            long startBS = System.nanoTime();
            binarySearch(arr, target);
            long endBS = System.nanoTime();
            System.out.println("Binary Search - Size: " + size + ", Time: " + (endBS - startBS) / 1_000_000.0 + " ms");
        }
    }
} 