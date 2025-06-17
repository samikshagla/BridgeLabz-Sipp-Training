import java.util.Scanner;
public class SingleD {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of rows:");
        int rows=sc.nextInt();
        System.out.println("Enter no. of Columns:");
        int columns=sc.nextInt();
        int[][]matrix=new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int[]arr=new int[rows*columns];
        int index=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                arr[index++]=matrix[i][j];
            }
        }
        System.out.println("1D Array:");
        for(int i=0;i<arr.length;i++){
           System.out.println(arr[i]+" ");
        }
    }
}
