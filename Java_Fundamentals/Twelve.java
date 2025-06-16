import java.util.Scanner;
public class Twelve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = sc.nextDouble();
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;
        System.out.printf("The distance in yards is %.2f while the distance in miles is %.4f\n",
                          distanceInYards, distanceInMiles);

        
    }
}
