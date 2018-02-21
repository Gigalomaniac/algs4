import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class ex1_1_5
{
    public static void main(String[] args)
    {
        StdOut.println("Please enter double values x and y.");
        double x = StdIn.readDouble();
        double y = StdIn.readDouble();
        StdOut.println(x > 0 && x < 1 && y > 0 && y < 1);
    }
}
