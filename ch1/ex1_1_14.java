public class ex1_1_14
{
    public static int lg(int N)
    {
        int i;
        for (i = 0; N > 1; i++)
            N /= 2;
        return i;
    }
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        if (N > 0)
            StdOut.printf("%d\n", lg(N));
        else
            StdOut.println("Not supported");
    } 
}
