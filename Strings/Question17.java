import java.util.*;
public class Question17 {
    static String charType(char c) {
        if (c >= 'A' && c <= 'Z') c = (char)(c + 32);
        if (c >= 'a' && c <= 'z') {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') return "Vowel";
            return "Consonant";
        }
        return "Not a Letter";
    }
    static String[][] analyze(String s) {
        String[][] arr = new String[s.length()][2];
        for (int i = 0; i < s.length(); i++) {
            arr[i][0] = String.valueOf(s.charAt(i));
            arr[i][1] = charType(s.charAt(i));
        }
        return arr;
    }
    static void display(String[][] arr) {
        System.out.println("Char\tType");
        for (String[] row : arr) System.out.println(row[0] + "\t" + row[1]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[][] arr = analyze(s);
        display(arr);
    }
} 