public class CountingSortStudentAges {
    public static void countingSort(int[] arr) {
        int min = 10, max = 18;
        int range = max - min + 1;
        int[] count = new int[range];
        int[] output = new int[arr.length];
        for (int i = 0; i < arr.length; i++) count[arr[i] - min]++;
        for (int i = 1; i < range; i++) count[i] += count[i - 1];
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }
        for (int i = 0; i < arr.length; i++) arr[i] = output[i];
    }

    public static void main(String[] args) {
        int[] ages = {12, 15, 11, 18, 10, 14, 13, 17, 16, 12};
        System.out.println("Original Student Ages:");
        for (int age : ages) System.out.print(age + " ");
        countingSort(ages);
        System.out.println("\nSorted Student Ages:");
        for (int age : ages) System.out.print(age + " ");
    }
} 