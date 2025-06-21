import java.util.*;
public class Question6 {
    static void generateException(String s) {
        System.out.println(Integer.parseInt(s));
    }
    static void handleException(String s) {
        try {
            System.out.println(Integer.parseInt(s));
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught");
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