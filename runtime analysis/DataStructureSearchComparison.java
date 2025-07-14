import java.util.*;

public class DataStructureSearchComparison {
    public static void main(String[] args) {
        int[] sizes = {1000, 100000, 1000000};
        Random rand = new Random();
        for (int size : sizes) {
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) arr[i] = i;
            int target = rand.nextInt(size);

            // Array search
            long startArr = System.nanoTime();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) break;
            }
            long endArr = System.nanoTime();
            System.out.println("Array Search - Size: " + size + ", Time: " + (endArr - startArr) / 1_000_000.0 + " ms");

            // HashSet search
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < size; i++) set.add(i);
            long startSet = System.nanoTime();
            set.contains(target);
            long endSet = System.nanoTime();
            System.out.println("HashSet Search - Size: " + size + ", Time: " + (endSet - startSet) / 1_000_000.0 + " ms");

            // TreeSet search
            TreeSet<Integer> tree = new TreeSet<>();
            for (int i = 0; i < size; i++) tree.add(i);
            long startTree = System.nanoTime();
            tree.contains(target);
            long endTree = System.nanoTime();
            System.out.println("TreeSet Search - Size: " + size + ", Time: " + (endTree - startTree) / 1_000_000.0 + " ms");
        }
    }
} 