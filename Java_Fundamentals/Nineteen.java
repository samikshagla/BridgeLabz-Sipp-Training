import java.util.Scanner;

public class Nineteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1 of the triangle in meters: ");
        double side1 = sc.nextDouble();
        System.out.print("Enter side 2 of the triangle in meters: ");
        double side2 = sc.nextDouble();
        System.out.print("Enter side 3 of the triangle in meters: ");
        double side3 = sc.nextDouble();
        double perimeter = side1 + side2 + side3;
        double distanceToRun = 5 * 1000;
        double rounds = distanceToRun / perimeter;
        System.out.printf("The total number of rounds the athlete will run is %.2f to complete 5 km\n", rounds);
    }
}
