import java.util.*;
public class Question14 {
    static int[] randomAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) ages[i] = 10 + (int)(Math.random() * 90);
        return ages;
    }
    static String[][] canVote(int[] ages) {
        String[][] res = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            res[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) res[i][1] = "false";
            else res[i][1] = ages[i] >= 18 ? "true" : "false";
        }
        return res;
    }
    static void display(String[][] arr) {
        System.out.println("Age\tCanVote");
        for (String[] row : arr) System.out.println(row[0] + "\t" + row[1]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ages = randomAges(n);
        String[][] res = canVote(ages);
        display(res);
    }
} 