import java.util.*;
public class Question10 {
    static void generateException(String s) {
        System.out.println(s.charAt(s.length()));
    }
    static void handleException(String s) {
        try {
            System.out.println(s.charAt(s.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught");
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