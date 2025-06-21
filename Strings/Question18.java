import java.util.*;
public class Question18 {
    static int[] trimIndices(String s) {
        int start = 0, end = s.length() - 1;
        while (start < s.length() && s.charAt(start) == ' ') start++;
        while (end >= 0 && s.charAt(end) == ' ') end--;
        return new int[]{start, end + 1};
    }
    static String substringByCharAt(String s, int start, int end) {
        String res = "";
        for (int i = start; i < end; i++) res += s.charAt(i);
        return res;
    }
    static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) if (a.charAt(i) != b.charAt(i)) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] idx = trimIndices(s);
        String user = substringByCharAt(s, idx[0], idx[1]);
        String built = s.trim();
        boolean res = compareStrings(user, built);
        System.out.println(res);
    }
} 