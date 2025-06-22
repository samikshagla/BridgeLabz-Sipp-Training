import java.util.*;
public class Problem4 {
    public String removeDuplicates(String s) {
        String res = "";
        Set<Character> seen = new HashSet<>();
        for (char ch : s.toCharArray()) {
            if (!seen.contains(ch)) {
                res += ch;
                seen.add(ch);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Problem4 p = new Problem4();
        System.out.println(p.removeDuplicates(s));
    }
} 