import java.util.*;
public class Question15 {
    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }
    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }
    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }
    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double km = sc.nextDouble();
        double miles = sc.nextDouble();
        double meters = sc.nextDouble();
        double feet = sc.nextDouble();
        System.out.println(convertKmToMiles(km));
        System.out.println(convertMilesToKm(miles));
        System.out.println(convertMetersToFeet(meters));
        System.out.println(convertFeetToMeters(feet));
    }
} 