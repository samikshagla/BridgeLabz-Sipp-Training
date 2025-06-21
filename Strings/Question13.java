import java.util.*;
public class Question13 {
    static String computerChoice() {
        int n = (int)(Math.random() * 3);
        if (n == 0) return "rock";
        if (n == 1) return "paper";
        return "scissors";
    }
    static int winner(String user, String comp) {
        if (user.equals(comp)) return 0;
        if (user.equals("rock") && comp.equals("scissors")) return 1;
        if (user.equals("paper") && comp.equals("rock")) return 1;
        if (user.equals("scissors") && comp.equals("paper")) return 1;
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int games = sc.nextInt();
        int userWin = 0, compWin = 0, draw = 0;
        String[][] results = new String[games][3];
        for (int i = 0; i < games; i++) {
            String user = sc.next();
            String comp = computerChoice();
            int res = winner(user, comp);
            if (res == 1) userWin++;
            else if (res == -1) compWin++;
            else draw++;
            results[i][0] = user;
            results[i][1] = comp;
            results[i][2] = res == 1 ? "User" : res == -1 ? "Computer" : "Draw";
        }
        System.out.println("User\tComputer\tWinner");
        for (int i = 0; i < games; i++) System.out.println(results[i][0] + "\t" + results[i][1] + "\t" + results[i][2]);
        double userPct = 100.0 * userWin / games;
        double compPct = 100.0 * compWin / games;
        System.out.printf("User wins: %d (%.2f%%)\n", userWin, userPct);
        System.out.printf("Computer wins: %d (%.2f%%)\n", compWin, compPct);
        System.out.printf("Draws: %d\n", draw);
    }
} 