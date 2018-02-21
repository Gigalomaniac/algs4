import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class ex1_1_20
{
    public static double lnFac(int N)
    {
        if (N == 0) return 0;
        return Math.log(N) + lnFac(N-1);
    }
    
    public static void main(String[] args)
    {
        int N = StdIn.readInt();
        StdOut.println(lnFac(N));
    }
}
