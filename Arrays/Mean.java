import java.util.Scanner;

public class Mean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] heights = new double[11];
        System.out.println("Enter the heights of 11 football players:");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
        }
        double sum = 0;
        for (double h : heights) {
            sum += h;
        }
        double mean = sum / heights.length;
        System.out.println("Mean height of the team: " + mean);
    }
}
