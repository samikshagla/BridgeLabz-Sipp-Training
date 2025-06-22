import java.util.*;
public class Problem2 {
    public String reverse(String s) {
        String res = "";
        for (int i = s.length() - 1; i >= 0; i--) res += s.charAt(i);
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Problem2 p = new Problem2();
        System.out.println(p.reverse(s));
    }
} 