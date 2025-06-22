import java.util.*;
public class Problem1 {
    public int[] countVowelsAndConsonants(String s) {
        int v = 0, c = 0;
        for (char ch : s.toCharArray()) {
            char ch2 = Character.toLowerCase(ch);
            if (ch2 >= 'a' && ch2 <= 'z') {
                if (ch2 == 'a' || ch2 == 'e' || ch2 == 'i' || ch2 == 'o' || ch2 == 'u') v++;
                else c++;
            }
        }
        return new int[]{v, c};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Problem1 p = new Problem1();
        int[] res = p.countVowelsAndConsonants(s);
        System.out.println(res[0] + " " + res[1]);
    }
} 