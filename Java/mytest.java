import java.util.Scanner;

public class mytest {
    public static void main(String[] args) 
    {
            System.out.println("Enter two numbers:");
            Scanner sc=new Scanner(System.in);
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z;
            try
            {
                z=x/y;
                System.out.println("Division is="+z);
            }
            catch(ArithmeticException e)
            {
                System.out.println("Division number cant be divided by zero");
            }
            catch(NumberFormatException e)
            {
                System.out.println("Number Format Exception");
            }
            catch(Exception e)
            {
                System.out.println("Exception contains all the exceptions");
            }
            finally
            {
                System.out.println("All resources deallocated");
            }
            System.out.println("Executed Normally!");
    }
    
}
