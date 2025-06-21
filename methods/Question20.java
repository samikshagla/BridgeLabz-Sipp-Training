import java.util.*;
public class Question20 {
    public double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        return weight / (heightM * heightM);
    }
    public String bmiStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        if (bmi < 25) return "Normal";
        if (bmi < 30) return "Overweight";
        return "Obese";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] arr = new double[10][3];
        for (int i = 0; i < 10; i++) {
            arr[i][0] = sc.nextDouble();
            arr[i][1] = sc.nextDouble();
        }
        Question20 q = new Question20();
        String[] status = new String[10];
        for (int i = 0; i < 10; i++) {
            arr[i][2] = q.calculateBMI(arr[i][0], arr[i][1]);
            status[i] = q.bmiStatus(arr[i][2]);
        }
        System.out.println("Weight\tHeight\tBMI\tStatus");
        for (int i = 0; i < 10; i++) System.out.println(arr[i][0] + "\t" + arr[i][1] + "\t" + arr[i][2] + "\t" + status[i]);
    }
} 