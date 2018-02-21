import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Matrix
{
    public static double dot(double[] x, double[] y)
    {
        int N = x.length;
        double z = 0;
        for (int i = 0; i < N; i++)
            z += x[i]*y[i];
        return z;
    }
    public static double[][] mult(double[][] a, double[][] b)
    {
        int M = a.length;
        int N = a[0].length;
        int P = b[0].length;
        double[][] c = new double[M][P];
        for (int i = 0; i < M; i++)
            for (int j = 0; j < P; j++)
                for (int k = 0; k < N; k++)
                    c[i][j] += a[i][k]*b[k][j];
        return c;
    }
    public static double[][] transpose(double[][] a)
    {
        int M = a.length;
        int N = a[0].length;
        double[][] t = new double[N][M];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < M; j++)
                t[i][j] = a[j][i];
        return t;
    }
    public static double[] mult(double[][] a, double[] x)
    {
        int M = a.length;
        int N = x.length;
        double[] c = new double[M];
        for (int i = 0; i < M; i++)
            for (int k = 0; k < N; k++)
                c[i] += a[i][k]*x[k];
        return c;
    }
    public static double[] mult(double[] y, double[][] a)
    {
        int N = y.length;
        int M = a[0].length;
        double[] c = new double[M];
        for (int j = 0; j < M; j++)
            for (int k = 0; k < N; k++)
                c[j] += y[k]*a[k][j];
        return c;
    }
    public static double[] readArray(int N)
    {
        double[] x = new double[N];
        StdOut.println("Please enter an array with " + N + " elements.");
        for (int i = 0; i < N; i++)
            x[i] = StdIn.readDouble();
        return x;
    }
    public static double[][] readMatrix(int M, int N)
    {
        double[][] a = new double[M][N];
        StdOut.println("Please enter a " + M + " by " + N + " matrix.");
        for (int i = 0; i < M; i++)
            for (int j = 0; j < N; j++)
                a[i][j] = StdIn.readDouble();
        return a;
    }
    public static void printArray(double[] x)
    {
        int N = x.length;
        for (int i = 0; i < N; i++)
            StdOut.print(x[i] + " ");
        StdOut.println();
    }
    public static void printMatrix(double[][] a)
    {
        int M = a.length;
        int N = a[0].length;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++)
                StdOut.printf("%10.4f\t", a[i][j]);
            StdOut.println();
        }
    }
    public static void main(String[] args)
    {
        int M = Integer.parseInt(args[0]);
        int N = Integer.parseInt(args[1]);
        int P = Integer.parseInt(args[2]);
        StdOut.println("array x:");
        double[] x = readArray(N);
        StdOut.println("array y:");
        double[] y = readArray(N);
        StdOut.println("matrix a:");
        double[][] a = readMatrix(M, N);
        StdOut.println("matrix b:");
        double[][] b = readMatrix(N, P);
        StdOut.println("dot product of vectors x & y: " + dot(x, y));
        StdOut.println("multiplication of matrices a & b:");
        printMatrix(mult(a, b));
        StdOut.println("transpose of matrix a:");
        printMatrix(transpose(a));
        StdOut.println("multiplication of matrix a and vector x:");
        printArray(mult(a, x));
        StdOut.println("multiplication of vector y and matrix b:");
        printArray(mult(y, b));
    }
}
