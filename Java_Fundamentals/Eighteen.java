import java.util.Scanner;

public class Eighteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double number1 = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double number2 = sc.nextDouble();
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number2 != 0 ? number1 / number2 : Double.NaN; 
        System.out.printf(
            "The addition, subtraction, multiplication, and division value of 2 numbers %.2f and %.2f is:\n%.2f, %.2f, %.2f, and %.2f\n",
            number1, number2, addition, subtraction, multiplication, division);

    }
}

