import java.util.Arrays;
public class Matrix {
    public static double dot(double[] a, double[] b){
        if (a.length != b.length){
            System.out.println("Arrays must be equal length for dot product.");
            return 0;
        }

        double result = 0;

        for (int i = 0; i < a.length; i++){
            result += a[i] * b[i];
        }
        return result;
    }

    public static double[][] multiply(double[][] a, double[][] b) {
        int rowsA = a.length;
        int rowsB = b.length;
        int columnsA = a[0].length;
        int columnsB = b[0].length;

        double[][] c = new double[rowsA][columnsB];

        if (columnsA != rowsB){
            System.out.println("Cannot multiply matrices");
            return c;
        }

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < columnsB; j++) {
                for (int k = 0; k < columnsA; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return c;
    }

    public static double[][] transpose(double[][] a) {
        int rows = a.length;
        int columns = a[0].length;


        double[][] b = new double[columns][rows];

        if (rows > columns) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    b[j][i] = a[i][j];
                }
            }
        } else {
            for (int i = 0; i < columns; i++) {
                for (int j = 0; j < rows; j++) {
                    b[i][j] = a[j][i];
                }
            }
        }
        return b;
    }

    public static double[] multiply(double[][] a, double[] b){
        double[] c = new double[a.length];

        for (int i = 0; i < b.length; i++)
        {
            for (int j = 0; j < a[0].length; j++)
                c[i] += a[i][j]*b[j];
        }
        return c;
    }

    public static double[] multiply(double[] a, double[][] b){
        double[] c = new double[b[0].length];

        for (int j = 0; j < b[0].length; j++)
        { // Dot product of y[] and column j.
            for (int i = 0; i < a.length; i++)
                c[j] += a[i]*b[i][j];
        }
        return c;
    }


    public static void main(String[] args){
        int trials = Integer.parseInt(args[0]);
        double[][] p = StdArrayIO.readDouble2D();
        double[] ranks = new double[p.length];
        rank[0] = 1.0;
        for (int t = 0; t < trials; t++)
            ranks = Matrix.multiply(ranks, p);
        StdArrayIO.print(ranks);
    }
}
