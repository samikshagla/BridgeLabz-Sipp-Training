import java.util.*;
public class Question24 {
    public int[][] randomMatrix(int rows, int cols) {
        int[][] m = new int[rows][cols];
        for (int i = 0; i < rows; i++) for (int j = 0; j < cols; j++) m[i][j] = (int)(Math.random() * 10);
        return m;
    }
    public int[][] transpose(int[][] m) {
        int[][] t = new int[m[0].length][m.length];
        for (int i = 0; i < m.length; i++) for (int j = 0; j < m[0].length; j++) t[j][i] = m[i][j];
        return t;
    }
    public int determinant2x2(int[][] m) {
        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
    }
    public int determinant3x3(int[][] m) {
        return m[0][0]*(m[1][1]*m[2][2]-m[1][2]*m[2][1]) - m[0][1]*(m[1][0]*m[2][2]-m[1][2]*m[2][0]) + m[0][2]*(m[1][0]*m[2][1]-m[1][1]*m[2][0]);
    }
    public double[][] inverse2x2(int[][] m) {
        int det = determinant2x2(m);
        if (det == 0) return null;
        double[][] inv = new double[2][2];
        inv[0][0] = m[1][1] / (double)det;
        inv[0][1] = -m[0][1] / (double)det;
        inv[1][0] = -m[1][0] / (double)det;
        inv[1][1] = m[0][0] / (double)det;
        return inv;
    }
    public void display(int[][] m) {
        for (int[] row : m) {
            for (int v : row) System.out.print(v + " ");
            System.out.println();
        }
    }
    public void display(double[][] m) {
        for (double[] row : m) {
            for (double v : row) System.out.print(v + " ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Question24 q = new Question24();
        int[][] m2 = q.randomMatrix(2, 2);
        q.display(m2);
        System.out.println(q.determinant2x2(m2));
        double[][] inv2 = q.inverse2x2(m2);
        if (inv2 != null) q.display(inv2);
        int[][] m3 = q.randomMatrix(3, 3);
        q.display(m3);
        System.out.println(q.determinant3x3(m3));
        int[][] t3 = q.transpose(m3);
        q.display(t3);
    }
}
