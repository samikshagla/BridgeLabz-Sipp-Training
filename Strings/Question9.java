public class Question9 {
    static void generateException() {
        String text = null;
        System.out.println(text.length());
    }
    static void handleException() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught");
        }
    }
    public static void main(String[] args) {
        try { generateException(); } catch (Exception e) {}
        handleException();
    }
} 