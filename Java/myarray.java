import java.util.Scanner;

public class myarray
{
    public static void main(String[] args) 
    {
        int a[]=new int[5];
        int sum=0;
        System.out.println("Enter five elements");
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<=4;i++)
        {
            a[i]=sc.nextInt();
            sum=sum+a[i];
        }
        System.out.println("Addition="+ " "+sum);
    }
    
}
