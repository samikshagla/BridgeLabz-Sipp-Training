import java.util.*;
public class Question38 {
    public int[][] randomMatrix(int rows, int cols) {
        int[][] m = new int[rows][cols];
        for (int i = 0; i < rows; i++) for (int j = 0; j < cols; j++) m[i][j] = (int)(Math.random() * 10);
        return m;
    }
    public int[][] add(int[][] a, int[][] b) {
        int[][] res = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) for (int j = 0; j < a[0].length; j++) res[i][j] = a[i][j] + b[i][j];
        return res;
    }
    public int[][] subtract(int[][] a, int[][] b) {
        int[][] res = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) for (int j = 0; j < a[0].length; j++) res[i][j] = a[i][j] - b[i][j];
        return res;
    }
    public int[][] multiply(int[][] a, int[][] b) {
        int[][] res = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) for (int j = 0; j < b[0].length; j++) for (int k = 0; k < a[0].length; k++) res[i][j] += a[i][k] * b[k][j];
        return res;
    }
    public void display(int[][] m) {
        for (int[] row : m) {
            for (int v : row) System.out.print(v + " ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Question38 q = new Question38();
        int[][] a = q.randomMatrix(2, 2);
        int[][] b = q.randomMatrix(2, 2);
        q.display(a);
        q.display(b);
        int[][] add = q.add(a, b);
        int[][] sub = q.subtract(a, b);
        q.display(add);
        q.display(sub);
        int[][] c = q.randomMatrix(2, 3);
        int[][] d = q.randomMatrix(3, 2);
        int[][] mul = q.multiply(c, d);
        q.display(c);
        q.display(d);
        q.display(mul);
    }
} 