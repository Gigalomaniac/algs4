import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;

public class ex1_2_1
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        double minDist = 1.0;
        Point2D[] p = new Point2D[N];
        StdDraw.setPenRadius(0.01);
        for (int i = 0; i < N; i++)
        {
            double x = Math.random();
            double y = Math.random();
            p[i] = new Point2D(x, y);
            p[i].draw();
            for (int j = i - 1; j >= 0; j--)
                if (minDist > p[i].distanceTo(p[j]))
                    minDist = p[i].distanceTo(p[j]);
        }
        StdOut.println("Minimum distance: " + minDist);
    }
}
