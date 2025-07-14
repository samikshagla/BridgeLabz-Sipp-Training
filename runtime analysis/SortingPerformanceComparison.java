import java.util.Arrays;
import java.util.Random;

public class SortingPerformanceComparison {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }
    public static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (int i = 0; i < n1; i++) L[i] = arr[l + i];
        for (int j = 0; j < n2; j++) R[j] = arr[m + 1 + j];
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) arr[k++] = L[i++];
            else arr[k++] = R[j++];
        }
        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 100000};
        Random rand = new Random();
        for (int size : sizes) {
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) arr[i] = rand.nextInt(size * 10);
            int[] arr1 = Arrays.copyOf(arr, arr.length);
            int[] arr2 = Arrays.copyOf(arr, arr.length);
            int[] arr3 = Arrays.copyOf(arr, arr.length);

            // Bubble Sort
            if (size <= 100000) {
                long startBubble = System.nanoTime();
                bubbleSort(arr1);
                long endBubble = System.nanoTime();
                System.out.println("Bubble Sort - Size: " + size + ", Time: " + (endBubble - startBubble) / 1_000_000.0 + " ms");
            }

            // Merge Sort
            long startMerge = System.nanoTime();
            mergeSort(arr2, 0, arr2.length - 1);
            long endMerge = System.nanoTime();
            System.out.println("Merge Sort - Size: " + size + ", Time: " + (endMerge - startMerge) / 1_000_000.0 + " ms");

            // Quick Sort
            long startQuick = System.nanoTime();
            quickSort(arr3, 0, arr3.length - 1);
            long endQuick = System.nanoTime();
            System.out.println("Quick Sort - Size: " + size + ", Time: " + (endQuick - startQuick) / 1_000_000.0 + " ms");
        }
    }
} 