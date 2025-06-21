import java.util.*;
public class Question3 {
    static boolean compareByCharAt(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) if (a.charAt(i) != b.charAt(i)) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        boolean res1 = compareByCharAt(a, b);
        boolean res2 = a.equals(b);
        System.out.println(res1 == res2);
    }
} 