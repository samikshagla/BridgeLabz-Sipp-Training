import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numEmployees = 10;
        double[][] employeeData = new double[numEmployees][2];
        double[] bonus = new double[numEmployees];
        double[] newSalary = new double[numEmployees];
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Enter details for Employee " + (i + 1));
            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();
            System.out.print("Enter years of service: ");
            double years = sc.nextDouble();
            if (salary <= 0 || years < 0) {
                System.out.println("Invalid input. Try again.");
                i--;
                continue;
            }
            employeeData[i][0] = salary;
            employeeData[i][1] = years;
        }
        for (int i = 0; i < numEmployees; i++) {
            double salary = employeeData[i][0];
            double years = employeeData[i][1];
            bonus[i] = (years > 5) ? salary * 0.05 : salary * 0.02;
            newSalary[i] = salary + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary;
            totalNewSalary += newSalary[i];
        }
        System.out.println("\n--- Bonus Report ---");
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Employee " + (i + 1) +
                " | Old Salary: " + employeeData[i][0] +
                " | Years: " + employeeData[i][1] +
                " | Bonus: " + bonus[i] +
                " | New Salary: " + newSalary[i]);
        }
        System.out.println("\nTotal Bonus: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
    }
}

