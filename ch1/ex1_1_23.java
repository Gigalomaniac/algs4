import java.util.Arrays;

public class ex1_1_23
{
    public static int rank(int key, int[] a)
    { return rank(key, a, 0, a.length - 1, 0); }
    
    public static int rank(int key, int[] a, int lo, int hi, int depth)
    {
        if (lo > hi) return -1;
        //for (int i = 0; i < depth; i++)
        //    StdOut.print(" ");
        //StdOut.println("lo = " + lo + ", hi = " + hi);
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) return rank(key, a, lo, mid - 1, ++depth);
        else if (key > a[mid]) return rank(key, a, mid + 1, hi, ++depth);
        else return mid;
    }
    
    public static void main(String[] args)
    {
        int[] whitelist = In.readInts(args[0]);
        char mode = args[1].charAt(0);
        Arrays.sort(whitelist);
        if (mode == '+')
            while (!StdIn.isEmpty())
            {
                int key = StdIn.readInt();
                if (rank(key, whitelist) == -1)
                    StdOut.println(key);
            }
        else if (mode == '-')
            while (!StdIn.isEmpty())
            {
                int key = StdIn.readInt();
                if (rank(key, whitelist) == key)
                    StdOut.println(key);
            }
        else 
            StdOut.println("Invalid parameter!");
    }
}