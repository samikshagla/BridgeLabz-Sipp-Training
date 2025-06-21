import java.util.*;
public class Question37 {
    public boolean isCollinearSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double m1 = (y2 - y1) / (x2 - x1);
        double m2 = (y3 - y2) / (x3 - x2);
        return m1 == m2;
    }
    public boolean isCollinearArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();
        Question37 q = new Question37();
        System.out.println(q.isCollinearSlope(x1, y1, x2, y2, x3, y3));
        System.out.println(q.isCollinearArea(x1, y1, x2, y2, x3, y3));
    }
}
