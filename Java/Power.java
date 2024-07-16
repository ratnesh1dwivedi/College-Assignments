//2. Write a Java Program to calculate m power n using recursive method programming.

class Power 
{
    // Function to calculate N raised to the power P
    static int power(int M, int N)
    {
        if (N == 0)
            return 1;
        else
            return M * power(M, N - 1);
    }
    public static void main(String[] args)
    {
        int M = 2;
        int N = 3;
 
        System.out.println(power(M, N));
    }
}
