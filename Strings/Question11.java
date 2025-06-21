import java.util.*;
public class Question11 {
    static int userLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int userLen = userLength(s);
        int builtLen = s.length();
        System.out.println(userLen == builtLen);
    }
} 