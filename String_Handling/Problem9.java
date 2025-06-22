import java.util.*;
public class Problem9 {
    public char mostFrequentChar(String s) {
        int[] freq = new int[256];
        for (char ch : s.toCharArray()) freq[ch]++;
        int max = 0;
        char res = 0;
        for (char ch : s.toCharArray()) {
            if (freq[ch] > max) {
                max = freq[ch];
                res = ch;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Problem9 p = new Problem9();
        System.out.println(p.mostFrequentChar(s));
    }
} 