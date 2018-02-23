import edu.princeton.cs.algs4.StdOut;

public class Transaction
{
    private final String who;
    private final SmartDate when;
    private final double amount;
    public Transaction(String who, SmartDate when, double amount)
    {
        this.who = who;
        this.when = when;
        this.amount = amount;
    }
    public String who()
    {
        return who;
    }
    public SmartDate when()
    {
        return when;
    }
    public double amount()
    {
        return amount;
    }
    public String toString()
    {
        return who + "\t" + when + "\t" + amount;
    }
    public boolean equals(Object x)
    {
        if (this == x) return true;
        if (x == null) return false;
        if (this.getClass() != x.getClass()) return false;
        Transaction that = (Transaction) x;
        if (!this.who.equals(that.who)) return false;
        if (!this.when.equals(that.when)) return false;
        if (this.amount != that.amount) return false;
        return true;
    }
    public static void main(String[] args)
    {
        String n = args[0];
        SmartDate d = new SmartDate(Integer.parseInt(args[1]), 
                                    Integer.parseInt(args[2]), 
                                    Integer.parseInt(args[3]));
        double a = Double.parseDouble(args[4]);
        SmartDate dT = new SmartDate(1, 1, 2018);
        Transaction t = new Transaction(n, d, a);
        StdOut.println(t);
        StdOut.println(t.equals(new Transaction("test", dT, 1000)));
    }
}
