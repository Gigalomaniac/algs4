public class ex1_1_21
{
    public static void main(String[] args)
    {
        int N = 100, n;
        String[] name = new String[N];
        int[][] num = new int[N][2];
        double[] quot = new double[N];
        for (n = 0; !StdIn.isEmpty(); n++) {
            name[n] = StdIn.readString();
            num[n][0] = StdIn.readInt();
            num[n][1] = StdIn.readInt();
            quot[n] = (double)num[n][0] / num[n][1];
        }
        for (int i = 0; i < n; i++)
            StdOut.printf("%10s %4d %4d %7.3f\n", name[i], num[i][0], num[i][1], quot[i]);
    }
}
