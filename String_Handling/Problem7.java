import java.util.*;
public class Problem7 {
    public String toggleCase(String s) {
        String res = "";
        for (char ch : s.toCharArray()) {
            if (Character.isUpperCase(ch)) res += Character.toLowerCase(ch);
            else if (Character.isLowerCase(ch)) res += Character.toUpperCase(ch);
            else res += ch;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Problem7 p = new Problem7();
        System.out.println(p.toggleCase(s));
    }
} 