import java.util.*;
public class Problem10 {
    public String removeChar(String s, char ch) {
        String res = "";
        for (int i = 0; i < s.length(); i++) if (s.charAt(i) != ch) res += s.charAt(i);
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch = sc.next().charAt(0);
        Problem10 p = new Problem10();
        System.out.println(p.removeChar(s, ch));
    }
} 