import java.util.Scanner;

public class BmiStatus{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int n = scanner.nextInt();
        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];
        for (int i = 0; i < n; i++) {
            do {
                System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
                weight[i] = scanner.nextDouble();
            } while (weight[i] <= 0);
            do {
                System.out.print("Enter height (m) for person " + (i + 1) + ": ");
                height[i] = scanner.nextDouble();
            } while (height[i] <= 0);
            bmi[i] = weight[i] / (height[i] * height[i]);
            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        System.out.println("\nResult:");
        System.out.println("Person\tWeight(kg)\tHeight(m)\tBMI\t\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s\n",
                    (i + 1),
                    weight[i],
                    height[i],
                    bmi[i],
                    status[i]);
        }
    }
}

