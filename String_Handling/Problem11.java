import java.util.*;
public class Problem11 {
    public boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;
        int[] freq = new int[256];
        for (char ch : a.toCharArray()) freq[ch]++;
        for (char ch : b.toCharArray()) freq[ch]--;
        for (int f : freq) if (f != 0) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        Problem11 p = new Problem11();
        System.out.println(p.isAnagram(a, b));
    }
} 