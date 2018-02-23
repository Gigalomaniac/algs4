import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class VisualCounter
{
    private final int N;
    private final int max;
    private int i;
    private int count;
    public VisualCounter(int n, int m)
    {
        N = n;
        max = m;
        StdDraw.setXscale(0, N + 1);
        StdDraw.setYscale(-max - 1, max + 1);
        StdDraw.setPenRadius(0.001*max*N);
    }
    public void plus()
    {
        if (i < N && count < max)
        {
            count++;
            i++;
            StdDraw.point(i, count);
        }
        else 
            StdOut.println("Invalid operation!");
    }
    public void minus()
    {
        if (i < N && count > -max)
        {
            count--;
            i++;
            StdDraw.point(i, count);
        }
        else 
            StdOut.println("Invalid operation!");
    }
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[1]);
        VisualCounter vc = new VisualCounter(N, max);
        while (!StdIn.isEmpty())
        {
            char op = StdIn.readChar();
            if (op == '+')
                vc.plus();
            else if (op == '-')
                vc.minus();
            else 
                StdOut.println("Invalid input!");
            StdIn.readLine();
        }
    }
}
