public class ex1_1_19
{
    public static long F(int N)
    {
        long[] a = new long[N+1];
        a[0] = 1;
        a[1] = 1;
        for (int i = 2; i < N; i++)
            a[i] = a[i-1] + a[i-2];
        return a[N-1];
    }
    public static void main(String args[])
    {
        for (int N = 1; N < 93; N++)
            StdOut.println(N + " " + F(N));
    }
}
