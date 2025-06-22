import java.util.*;
public class Problem6 {
    public int countOccurrences(String s, String sub) {
        int count = 0;
        for (int i = 0; i <= s.length() - sub.length(); i++) {
            if (s.substring(i, i + sub.length()).equals(sub)) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String sub = sc.nextLine();
        Problem6 p = new Problem6();
        System.out.println(p.countOccurrences(s, sub));
    }
} 