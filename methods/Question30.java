import java.util.*;
public class Question30 {
    public double[][] generateSalariesAndService(int n) {
        double[][] arr = new double[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = 10000 + (int)(Math.random() * 90000);
            arr[i][1] = 1 + (int)(Math.random() * 10);
        }
        return arr;
    }
    public double[][] calculateNewSalaryAndBonus(double[][] arr) {
        double[][] res = new double[arr.length][2];
        for (int i = 0; i < arr.length; i++) {
            double bonus = arr[i][1] > 5 ? arr[i][0] * 0.05 : arr[i][0] * 0.02;
            res[i][0] = arr[i][0] + bonus;
            res[i][1] = bonus;
        }
        return res;
    }
    public void display(double[][] oldArr, double[][] newArr) {
        double sumOld = 0, sumNew = 0, sumBonus = 0;
        System.out.println("Salary\tService\tNewSalary\tBonus");
        for (int i = 0; i < oldArr.length; i++) {
            sumOld += oldArr[i][0];
            sumNew += newArr[i][0];
            sumBonus += newArr[i][1];
            System.out.println((int)oldArr[i][0] + "\t" + (int)oldArr[i][1] + "\t" + (int)newArr[i][0] + "\t" + (int)newArr[i][1]);
        }
        System.out.println("SumOld: " + (int)sumOld + ", SumNew: " + (int)sumNew + ", TotalBonus: " + (int)sumBonus);
    }
    public static void main(String[] args) {
        Question30 q = new Question30();
        double[][] arr = q.generateSalariesAndService(10);
        double[][] newArr = q.calculateNewSalaryAndBonus(arr);
        q.display(arr, newArr);
    }
} 