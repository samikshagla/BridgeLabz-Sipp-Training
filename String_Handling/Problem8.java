import java.util.*;
public class Problem8 {
    public int compareStrings(String a, String b) {
        int n = Math.min(a.length(), b.length());
        for (int i = 0; i < n; i++) {
            if (a.charAt(i) != b.charAt(i)) return a.charAt(i) - b.charAt(i);
        }
        return a.length() - b.length();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        Problem8 p = new Problem8();
        int cmp = p.compareStrings(a, b);
        if (cmp < 0) System.out.println(a + " comes before " + b + " in lexicographical order");
        else if (cmp > 0) System.out.println(a + " comes after " + b + " in lexicographical order");
        else System.out.println("Both strings are equal");
    }
} 