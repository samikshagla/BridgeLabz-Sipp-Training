import java.util.*;
public class Question29 {
    public int generateOTP() {
        return 100000 + (int)(Math.random() * 900000);
    }
    public boolean areUnique(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int v : arr) set.add(v);
        return set.size() == arr.length;
    }
    public static void main(String[] args) {
        Question29 q = new Question29();
        int[] otps = new int[10];
        for (int i = 0; i < 10; i++) otps[i] = q.generateOTP();
        System.out.println(Arrays.toString(otps));
        System.out.println(q.areUnique(otps));
    }
}
