public class ex1_1_24
{
    public static int gcd(int p, int q)
    {
        StdOut.println("p = " + p + ", q = " + q);
        if (q == 0) return p;
        int r = p % q;
        return gcd(q, r);
    }
    
    public static void main(String[] args)
    {
        int p = Integer.parseInt(args[0]);
        int q = Integer.parseInt(args[1]);
        StdOut.println("GCD of " + p + " and " + q + " is " + gcd(p, q));
    }
}
