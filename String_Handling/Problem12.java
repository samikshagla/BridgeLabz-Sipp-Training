import java.util.*;
public class Problem12 {
    public String replaceWord(String sentence, String oldWord, String newWord) {
        String[] words = sentence.split(" ");
        String res = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(oldWord)) res += newWord;
            else res += words[i];
            if (i != words.length - 1) res += " ";
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String oldWord = sc.next();
        String newWord = sc.next();
        Problem12 p = new Problem12();
        System.out.println(p.replaceWord(sentence, oldWord, newWord));
    }
} 