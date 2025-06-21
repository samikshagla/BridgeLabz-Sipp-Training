import java.util.*;
public class Question12 {
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
    static String[] userSplit(String s) {
        int n = userLength(s);
        ArrayList<String> words = new ArrayList<>();
        String word = "";
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                if (!word.equals("")) words.add(word);
                word = "";
            } else {
                word += c;
            }
        }
        if (!word.equals("")) words.add(word);
        return words.toArray(new String[0]);
    }
    static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) if (!a[i].equals(b[i])) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr1 = userSplit(s);
        String[] arr2 = s.split(" ");
        boolean res = compareArrays(arr1, arr2);
        System.out.println(res);
    }
} 