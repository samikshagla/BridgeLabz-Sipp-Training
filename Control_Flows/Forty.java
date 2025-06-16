import java.util.Scanner;

public class Forty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight in kg: ");
        double weight = scanner.nextDouble();
        System.out.print("Enter height in cm: ");
        double heightInCm = scanner.nextDouble();
        double heightInMeters = heightInCm / 100;
        double bmi = weight / (heightInMeters * heightInMeters);
        System.out.printf("Your BMI is: %.2f\n", bmi);
        if (bmi <= 18.4) {
            System.out.println("Status: Underweight");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Status: Normal");
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            System.out.println("Status: Overweight");
        } else {
            System.out.println("Status: Obese");
        }
    }
}

