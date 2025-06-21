import java.util.*;
public class Question19 {
    static String charType(char c) {
        if (c >= 'A' && c <= 'Z') c = (char)(c + 32);
        if (c >= 'a' && c <= 'z') {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') return "Vowel";
            return "Consonant";
        }
        return "Not a Letter";
    }
    static int[] countVC(String s) {
        int v = 0, c = 0;
        for (int i = 0; i < s.length(); i++) {
            String t = charType(s.charAt(i));
            if (t.equals("Vowel")) v++;
            else if (t.equals("Consonant")) c++;
        }
        return new int[]{v, c};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] res = countVC(s);
        System.out.println("Vowels: " + res[0] + ", Consonants: " + res[1]);
    }
} 