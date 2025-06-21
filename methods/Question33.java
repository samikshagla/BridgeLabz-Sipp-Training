import java.util.*;
public class Question33 {
    public int[][] randomScores(int n) {
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < 3; j++)
                scores[i][j] = 30 + (int)(Math.random() * 71);
        return scores;
    }
    public double[][] calcStats(int[][] scores) {
        int n = scores.length;
        double[][] stats = new double[n][3];
        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double pct = Math.round((total / 3.0) * 10000.0 / 100.0) / 100.0;
            stats[i][0] = total;
            stats[i][1] = avg;
            stats[i][2] = pct;
        }
        return stats;
    }
    public void display(int[][] scores, double[][] stats) {
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\tPct");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t%.0f\t%.2f\t%.2f\n", scores[i][0], scores[i][1], scores[i][2], stats[i][0], stats[i][1], stats[i][2]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Question33 q = new Question33();
        int[][] scores = q.randomScores(n);
        double[][] stats = q.calcStats(scores);
        q.display(scores, stats);
    }
} 