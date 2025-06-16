import java.util.Scanner;

public class Two{

    public static void main(String[] args) {
        double km;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        km = sc.nextDouble();

        double miles = km * 0.621371; 

        System.out.println("The total miles is " + miles + " miles for the given " + km + " km");

       
    }
}