import java.util.Scanner;

public class TwentyThree{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age of Amar: ");
        int ageAmar = sc.nextInt();
        System.out.print("Enter height of Amar: ");
        double heightAmar = sc.nextDouble();
        System.out.print("Enter age of Akbar: ");
        int ageAkbar = sc.nextInt();
        System.out.print("Enter height of Akbar: ");
        double heightAkbar = sc.nextDouble();
        System.out.print("Enter age of Anthony: ");
        int ageAnthony = sc.nextInt();
        System.out.print("Enter height of Anthony: ");
        double heightAnthony = sc.nextDouble();
        String youngest = "";
        if (ageAmar <= ageAkbar && ageAmar <= ageAnthony) {
            youngest = "Amar";
        } else if (ageAkbar <= ageAmar && ageAkbar <= ageAnthony) {
            youngest = "Akbar";
        } else {
            youngest = "Anthony";
        }
        String tallest = "";
        if (heightAmar >= heightAkbar && heightAmar >= heightAnthony) {
            tallest = "Amar";
        } else if (heightAkbar >= heightAmar && heightAkbar >= heightAnthony) {
            tallest = "Akbar";
        } else {
            tallest = "Anthony";
        }
        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);
    }
}

