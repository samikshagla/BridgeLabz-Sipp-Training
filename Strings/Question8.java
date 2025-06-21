import java.util.*;
public class Question8 {
    static String toUpper(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') c = (char)(c - 32);
            res += c;
        }
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
        String user = toUpper(s);
        String built = s.toUpperCase();
        boolean res = compareStrings(user, built);
        System.out.println(res);
    }
} 