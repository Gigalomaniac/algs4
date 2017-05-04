public class ex1_1_14
{
    public static int lg(int N)
    {
        int i;
        for (i = 0; N != 0; i++)
            N /= 2;
        return i - 1;
    }
    public static void main(String[] args)
    {
        int num = Integer.parseInt(args[0]);
        StdOut.printf("%d\n", lg(num));
    } 
}