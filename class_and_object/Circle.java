import java.util.*;
// class circle
public class Circle {
    double radius;
    // constructor
    public Circle(double radius){
        this.radius=radius;
    }
// method to find circumference
    public void circumference(double radius){
        double circum=2*3.14*radius;
        System.out.println("Circumference:"+circum);
    }
    // method to find area
    public void area(double radius){
        double area=3.14*radius*radius;
        System.out.println("area:"+area);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double radius=sc.nextDouble();
        Circle c =new Circle(radius);
        c.circumference(radius);
        c.area(radius);
    }
}
