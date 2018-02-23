import java.util.Arrays;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Counter;

public class ex1_2_9
{
    public static int rank(int key, int[] a, Counter c)
    {
        int lo = 0;
        int hi = a.length - 1;
        c.increment();
        while (lo <= hi)
        {
            int mid = lo + (hi - lo) / 2;
            if      (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }
    public static void main(String[] args)
    {
        In in = new In(args[0]);
        int[] whitelist = in.readAllInts();
        Arrays.sort(whitelist);
        Counter c = new Counter("keys");
        while (!StdIn.isEmpty())
        {
            int key = StdIn.readInt();
            if (rank(key, whitelist, c) == -1)
                StdOut.println(key);
        }
        StdOut.println(c);
    }
}
