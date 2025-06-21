import java.util.*;
public class Question27 {
    static String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    static int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) return false;
        if (year % 100 == 0 && year % 400 != 0) return false;
        return true;
    }
    public static int getFirstDay(int month, int year) {
        int y = year;
        int m = month + 1;
        if (m < 3) {
            m += 12;
            y--;
        }
        int k = y % 100;
        int j = y / 100;
        int d = 1;
        int h = (d + 13 * (m + 1) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;
        return (h + 6) % 7;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int year = sc.nextInt();
        int numDays = days[month - 1];
        if (month == 2 && isLeapYear(year)) numDays = 29;
        int startDay = getFirstDay(month - 1, year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        for (int i = 0; i < startDay; i++) System.out.print("    ");
        for (int day = 1; day <= numDays; day++) {
            System.out.printf("%3d ", day);
            if ((day + startDay) % 7 == 0) System.out.println();
        }
        System.out.println();
    }
} 