import java.util.*;
public class Question4 {
    static void generateException(String s) {
        System.out.println(s.substring(3, 1));
    }
    static void handleException(String s) {
        try {
            System.out.println(s.substring(3, 1));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        try { generateException(s); } catch (Exception e) {}
        handleException(s);
    }
} 