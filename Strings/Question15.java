import java.util.*;
public class Question15 {
    static int[][] randomScores(int n) {
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < 3; j++)
                scores[i][j] = 30 + (int)(Math.random() * 71);
        return scores;
    }
    static double[][] calcStats(int[][] scores) {
        int n = scores.length;
        double[][] stats = new double[n][3];
        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double pct = Math.round((total / 3.0) * 100.0 / 100.0 * 100.0) / 100.0;
            stats[i][0] = total;
            stats[i][1] = avg;
            stats[i][2] = pct;
        }
        return stats;
    }
    static String[] calcGrade(double[][] stats) {
        String[] grades = new String[stats.length];
        for (int i = 0; i < stats.length; i++) {
            double pct = stats[i][2];
            if (pct >= 90) grades[i] = "A";
            else if (pct >= 80) grades[i] = "B";
            else if (pct >= 70) grades[i] = "C";
            else if (pct >= 60) grades[i] = "D";
            else grades[i] = "F";
        }
        return grades;
    }
    static void display(int[][] scores, double[][] stats, String[] grades) {
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\tPct\tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t%.0f\t%.2f\t%.2f\t%s\n", scores[i][0], scores[i][1], scores[i][2], stats[i][0], stats[i][1], stats[i][2], grades[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] scores = randomScores(n);
        double[][] stats = calcStats(scores);
        String[] grades = calcGrade(stats);
        display(scores, stats, grades);
    }
} 