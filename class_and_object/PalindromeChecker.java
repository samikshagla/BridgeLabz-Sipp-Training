import java.util.*;
public class PalindromeChecker {
    String text;
    public PalindromeChecker(String text) {
        this.text = text;
    }
    public boolean isPalindrome() {
        int l = 0, r = text.length() - 1;
        while (l < r) {
            if (text.charAt(l) != text.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
    public void displayResult() {
        System.out.println(isPalindrome());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        PalindromeChecker pc = new PalindromeChecker(text);
        pc.displayResult();
    }
} 