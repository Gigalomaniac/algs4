import edu.princeton.cs.algs4.StdOut;

public class ex1_2_6
{
    public static void main(String[] args)
    {
        StdOut.println(args[0].length() == args[1].length() && (args[0] + args[0]).indexOf(args[1]) >= 0);
    }
}
