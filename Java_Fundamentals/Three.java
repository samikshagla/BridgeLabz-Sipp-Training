import java.util.Scanner;
public class Three{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    double fee=sc.nextInt();
    double discount_percent=sc.nextInt();
    double discount=fee*(discount_percent/100);
    double finalfee=fee-discount;
    System.out.println("The discount amount is INR"+" "+discount+" "+"and final discounted fee is INR"+""+finalfee);
}
}
