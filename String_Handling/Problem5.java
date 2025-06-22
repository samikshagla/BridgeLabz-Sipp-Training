import java.util.*;
public class Problem5 {
    public String longestWord(String s) {
        String[] words = s.split(" ");
        String longest = "";
        for (String w : words) if (w.length() > longest.length()) longest = w;
        return longest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Problem5 p = new Problem5();
        System.out.println(p.longestWord(s));
    }
} 