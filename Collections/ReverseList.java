package Collections;
import java.util.*;

public class ReverseList {
    public static <T> void reverseList(List<T> list) {
        int left = 0, right = list.size() - 1;
        while (left < right) {
            T temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        LinkedList<Integer> linkedList = new LinkedList<>(arrList);
        reverseList(arrList);
        reverseList(linkedList);
        System.out.println("Reversed ArrayList: " + arrList);
        System.out.println("Reversed LinkedList: " + linkedList);
    }
} 