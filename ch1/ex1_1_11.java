public class ex1_1_11
{
    public static void readArray(boolean[][] array, int M, int N)
    {
        StdOut.println("Please enter a " + M + "*" + N + " boolean array.");
        for (int i = 0; i < M; i++)
            for (int j = 0; j < N; j++)
                array[i][j] = StdIn.readBoolean();
    }
    public static void printArray(boolean[][] array, int M, int N)
    {
        StdOut.print("   ");
        for (int i = 0; i < N; i++)
            StdOut.printf("%4d", i+1);
        StdOut.println();
        for (int i = 0; i < M; i++) {
            StdOut.printf("%3d", i+1);
            for (int j = 0; j < N; j++) {
                if (array[i][j])
                    StdOut.printf("%4c", '*');
                else
                    StdOut.printf("%4c", ' ');
            }
            StdOut.println();
        }
    }
    public static void main(String args[])
    {
        int M = Integer.parseInt(args[0]);
        int N = Integer.parseInt(args[1]);
        boolean[][] a = new boolean[M][N];
        readArray(a, M, N);
        printArray(a, M, N);
    }
}