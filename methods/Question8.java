import java.util.*;
public class Question8 {
    public boolean isSpringSeason(int month, int day) {
        if (month == 3 && day >= 20) return true;
        if (month == 6 && day <= 20) return true;
        if (month > 3 && month < 6) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        Question8 q = new Question8();
        boolean res = q.isSpringSeason(month, day);
        if (res) System.out.println("It's a Spring Season");
        else System.out.println("Not a Spring Season");
    }
} 