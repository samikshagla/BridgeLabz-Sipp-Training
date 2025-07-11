public class SelectionSortExamScores {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) minIdx = j;
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] scores = {88, 75, 92, 68, 81, 95};
        System.out.println("Original Exam Scores:");
        for (int score : scores) System.out.print(score + " ");
        selectionSort(scores);
        System.out.println("\nSorted Exam Scores:");
        for (int score : scores) System.out.print(score + " ");
    }
} 