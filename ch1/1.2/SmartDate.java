import edu.princeton.cs.algs4.StdOut;

public class SmartDate
{
    private final int month;
    private final int day;
    private final int year;
    private final int[] daysOfMonths = {31, 28, 
        31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private final int[] daysOfMonthsL = {31, 29, 
        31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private int[] dOm;
    private int days;
    private boolean isLeapYear(int y)
    {
        return (y % 100 != 0 && y % 4 == 0) || 
            (y % 100 == 0 && y % 400 == 0);
    }
    public SmartDate(int m, int d, int y)
    {
        dOm = isLeapYear(y) ? daysOfMonthsL : daysOfMonths;
        if (y < 1 || m < 1 || m > 12 || d < 1 || d > dOm[m-1])
            throw new RuntimeException("Invalid date!"); 
        month = m;
        day = d;
        year = y;
    }
    public String dayOfTheWeek()
    {
        if (year < 2000 || year >= 2100)
            throw new RuntimeException("Only 21st century is supported.");
        for (int i = 2000; i < year; i++)
        {
            dOm = isLeapYear(i) ? daysOfMonthsL : daysOfMonths;
            for (int j = 0; j < 12; j++)
                days += dOm[j];
        }
        dOm = isLeapYear(year) ? daysOfMonthsL : daysOfMonths;
        for (int j = 0; j < month - 1; j++)
            days += dOm[j];
        days += day;
        switch (days % 7)
        {
            case 1: return "Saturday";
            case 2: return "Sunday";
            case 3: return "Monday";
            case 4: return "Tuesday";
            case 5: return "Wednesday";
            case 6: return "Thursday";
            case 0: return "Friday";
        }
        return "Error!";
    }
    public int month()
    {
        return month;
    }
    public int day()
    {
        return day;
    }
    public int year()
    {
        return year;
    }
    public String toString()
    {
        return month() + "/" + day()
            + "/" + year();
    }
    public boolean equals(Object x)
    {
        if (this == x) return true;
        if (x == null) return false;
        if (this.getClass() != x.getClass()) return false;
        SmartDate that = (SmartDate) x;
        if (this.month != that.month) return false;
        if (this.day != that.day) return false;
        if (this.year != that.year) return false;
        return true;
    }
    public static void main(String[] args)
    {
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);
        SmartDate date = new SmartDate(m, d, y);
        StdOut.println(date);
        if (date.year() >= 2000 && date.year() < 2100)
            StdOut.println(date.dayOfTheWeek());
    }
}
