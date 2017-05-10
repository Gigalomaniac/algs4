public class ex1_1_19
{
    public static long F(int N)
    {
        if (N == 0) return 0;
        if (N == 1) return 1;
        long[] a = new long[N];
        a[0] = 1;
        a[1] = 1;
        for (int i = 2; i < N; i++)
            a[i] = a[i-1] + a[i-2];
        return a[N-1];
    }
    public static void main(String args[])
    {
        for (int N = 0; N < 100; N++)
            StdOut.println(N + " " + F(N));
    }
}