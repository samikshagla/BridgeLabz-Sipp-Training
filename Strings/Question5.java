import java.util.*;
public class Question5 {
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
        String s = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();
        String sub1 = substringByCharAt(s, start, end);
        String sub2 = s.substring(start, end);
        boolean res = compareStrings(sub1, sub2);
        System.out.println(res);
    }
} 