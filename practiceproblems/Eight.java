import java.util.Scanner;
public class Eight
{
    public static void main(String[]args)
{ 
    Scanner sc=new Scanner(System.in);
    double base=sc.nextDouble();
    int  exponent=sc.nextInt();
    double power=Math.pow(base,exponent);
    System.out.println(power);
}
}