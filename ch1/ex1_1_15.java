public class ex1_1_15
{
    public static int[] histogram(int[] a, int M)
    {
        int[] b = new int[M];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < M)
                b[a[i]]++;
            else
                continue;
        }
        return b;
    }
    
    public static void printArray(int[] a, int N)
    {
        for (int i = 0; i < N; i++) {
            StdOut.print(a[i] + " ");
            if (i % 5 == 4)
                StdOut.println();
        }
    }
            
    public static void main(String[] args)
    {
        StdOut.print("Size of array:");
        int N = StdIn.readInt();
        StdOut.println("Enter an array with " + N + " numbers.");
        int[] a = new int[N];
        for (int i = 0; i < N; i++)
            a[i] = StdIn.readInt();
        StdOut.println("Enter an integer M");
        int M = StdIn.readInt();
        int[] b = histogram(a, M);
        printArray(b, M);
    }
}