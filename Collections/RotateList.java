package Collections;
import java.util.*;

public class RotateList {
    public static <T> void rotateList(List<T> list, int k) {
        int n = list.size();
        k = k % n;
        List<T> rotated = new ArrayList<>(list.subList(k, n));
        rotated.addAll(list.subList(0, k));
        for (int i = 0; i < n; i++) list.set(i, rotated.get(i));
    }

    public static void main(String[] args) {
        ArrayList<Integer> rotateList = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        rotateList(rotateList, 2);
        System.out.println("Rotated List by 2: " + rotateList);
    }
} 