import java.util.*;
public class Question20 {
    static String[] userSplit(String s) {
        ArrayList<String> words = new ArrayList<>();
        String word = "";
        for (int i = 0; i < s.length(); i++) {
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
    static String[][] wordLengths(String[] words) {
        String[][] arr = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            arr[i][0] = words[i];
            arr[i][1] = String.valueOf(userLength(words[i]));
        }
        return arr;
    }
    static void display(String[][] arr) {
        System.out.println("Word\tLength");
        for (String[] row : arr) System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = userSplit(s);
        String[][] arr = wordLengths(words);
        display(arr);
    }
}
