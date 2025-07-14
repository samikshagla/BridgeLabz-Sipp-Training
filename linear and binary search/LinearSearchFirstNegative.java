public class LinearSearchFirstNegative {
    public static int findFirstNegative(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 0, -2, 4, -1};
        int index = findFirstNegative(arr);
        if (index != -1) {
            System.out.println("First negative number at index: " + index + ", value: " + arr[index]);
        } else {
            System.out.println("No negative number found.");
        }
    }
} 