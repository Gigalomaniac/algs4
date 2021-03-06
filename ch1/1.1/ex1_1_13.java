import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class ex1_1_13
{
    public static void readArray(int[][] array, int M, int N)
    {
        StdOut.println("Please enter a " + M + "*" + N + " integer array.");
        for (int i = 0; i < M; i++)
            for (int j = 0; j < N; j++)
                array[i][j] = StdIn.readInt();
    }
    public static void printArray(int[][] array, int M, int N)
    {
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++)
                StdOut.printf("%4d", array[i][j]);
            StdOut.println();
        }
    }
    public static void printTransposedArray(int[][] array, int M, int N)
    {
        for (int j = 0; j < N; j++) {
            for (int i = 0; i < M; i++)
                StdOut.printf("%4d", array[i][j]);
            StdOut.println();
        }
    }
    public static void main(String[] args)
    {
        int M = Integer.parseInt(args[0]);
        int N = Integer.parseInt(args[1]);
        int[][] array = new int[M][N];
        readArray(array, M, N);
        StdOut.println("Original");
        printArray(array, M, N);
        StdOut.println("Transposed");
        printTransposedArray(array, M, N);
    }
}
