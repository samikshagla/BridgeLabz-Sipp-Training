import java.util.Scanner;

public class TwentyTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter the Rate of Interest (in %): ");
        double rate = sc.nextDouble();
        System.out.print("Enter the Time (in years): ");
        double time = sc.nextDouble();
        double simpleInterest = (principal * rate * time) / 100;
        System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f%% and Time %.2f years\n",
                          simpleInterest, principal, rate, time);
    }
}

