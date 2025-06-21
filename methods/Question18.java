import java.util.*;
public class Question18 {
    public int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = 1000 + (int)(Math.random() * 9000);
        return arr;
    }
    public double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0], max = numbers[0], sum = 0;
        for (int v : numbers) {
            if (v < min) min = v;
            if (v > max) max = v;
            sum += v;
        }
        double avg = sum / (double)numbers.length;
        return new double[]{avg, min, max};
    }
    public static void main(String[] args) {
        Question18 q = new Question18();
        int[] arr = q.generate4DigitRandomArray(5);
        System.out.println(Arrays.toString(arr));
        double[] res = q.findAverageMinMax(arr);
        System.out.println(res[0] + " " + res[1] + " " + res[2]);
    }
} 