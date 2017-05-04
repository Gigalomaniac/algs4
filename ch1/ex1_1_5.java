public class ex1_1_5
{
    public static void main(String args[])
    {
        StdOut.println("Please enter double values x and y.");
        double x = StdIn.readDouble();
        double y = StdIn.readDouble();
        if (x > 0 && x < 1 && y > 0 && y < 1)
            StdOut.println("true");
        else
            StdOut.println("false");
    }
}

        