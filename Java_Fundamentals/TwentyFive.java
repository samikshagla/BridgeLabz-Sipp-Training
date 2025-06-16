import java.util.Scanner;

public class TwentyFive{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter From City: ");
        String fromCity = sc.nextLine();
        System.out.print("Enter Via City: ");
        String viaCity = sc.nextLine();
        System.out.print("Enter To City: ");
        String toCity = sc.nextLine();
        System.out.print("Enter distance from " + fromCity + " to " + viaCity + " (in miles): ");
        double fromToVia = sc.nextDouble();
        System.out.print("Enter distance from " + viaCity + " to " + toCity + " (in miles): ");
        double viaToFinalCity = sc.nextDouble();
        System.out.print("Enter time from " + fromCity + " to " + viaCity + " (in minutes): ");
        double timeFromToVia = sc.nextDouble();
        System.out.print("Enter time from " + viaCity + " to " + toCity + " (in minutes): ");
        double timeViaToFinalCity = sc.nextDouble();
        double totalDistanceMiles = fromToVia + viaToFinalCity;
        double totalDistanceKm = totalDistanceMiles * 1.60934; 
        double totalTime = timeFromToVia + timeViaToFinalCity;
        System.out.printf("The Total Distance travelled by %s from %s to %s via %s is %.2f km and the Total Time taken is %.2f minutes\n",
                name, fromCity, toCity, viaCity, totalDistanceKm, totalTime);
    }
}

