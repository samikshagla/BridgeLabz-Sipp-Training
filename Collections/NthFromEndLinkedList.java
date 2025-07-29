package Collections;
import java.util.*;

public class NthFromEndLinkedList {
    public static <T> T nthFromEnd(LinkedList<T> list, int n) {
        Iterator<T> ahead = list.iterator();
        Iterator<T> behind = list.iterator();
        for (int i = 0; i < n; i++) {
            if (ahead.hasNext()) ahead.next();
            else return null;
        }
        while (ahead.hasNext()) {
            ahead.next();
            behind.next();
        }
        return behind.hasNext() ? behind.next() : null;
    }

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        System.out.println("2nd from end: " + nthFromEnd(ll, 2));
    }
} 