import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class ex1_2_2
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        Interval1D[] in = new Interval1D[N];
        for (int i = 0; i < N; i++)
        {
            double lo = StdIn.readDouble();
            double hi = StdIn.readDouble();
            in[i] = new Interval1D(lo, hi);
        }
        for (int i = 0; i < N; i++)
            for (int j = i + 1; j < N; j++)
                if (in[i].intersects(in[j]))
                    StdOut.println(in[i] + " and " + in[j]);
    }
}
