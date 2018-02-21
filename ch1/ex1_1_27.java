import edu.princeton.cs.algs4.StdOut;

public class ex1_1_27
{
    public static double binomial(int N, int k, double p)
    {
        /*
        if (N == 0 && k == 0) return 1.0;
        if (N < 0 || k < 0) return 0.0;
        return (1.0 - p)*binomial(N-1, k, p) + p*binomial(N-1, k-1, p);
        */
        if (N < 0 || k < 0) return 0.0;
        double[][] b = new double[N+1][k+1];
        b[0][0] = 1.0; 
        for (int i = 1; i <= N; i++)
        {
            b[i][0] = (1.0 - p)*b[i-1][0];
            for (int j = 1; j <= k; j++)
                b[i][j] = (1.0 - p)*b[i-1][j] + p*b[i-1][j-1];
        }
        return b[N][k];
    }
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        double p = Double.parseDouble(args[2]);
        StdOut.println(binomial(N, k, p));
    }
}
