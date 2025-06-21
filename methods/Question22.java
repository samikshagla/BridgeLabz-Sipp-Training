import java.util.*;
public class Question22 {
    public boolean isLeapYear(int year) {
        if (year < 1582) return false;
        if (year % 4 != 0) return false;
        if (year % 100 == 0 && year % 400 != 0) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        Question22 q = new Question22();
        boolean res = q.isLeapYear(year);
        System.out.println(res);
    }
} 