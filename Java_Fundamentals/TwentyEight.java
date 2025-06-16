import java.util.Scanner;

public class TwentyEight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = sc.nextInt();
        System.out.print("Enter the number of children: ");
        int numberOfChildren = sc.nextInt();
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;
        System.out.printf("The number of chocolates each child gets is %d and the number of remaining chocolates is %d\n",
                          chocolatesPerChild, remainingChocolates);
    }
}
