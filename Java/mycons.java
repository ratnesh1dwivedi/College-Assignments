public class mycons
{
    int p;//instance variable
    mycons()//default constructor
    {
        System.out.println("i am default");
        int i;
        for (i=0;i<=6;i++)
        {
            System.out.println(i);
        }
    }
    mycons(int x)// parameteric constructor
    {
        System.out.println("I am 1 parameter");
    }
    mycons(int x ,int y)//parameteric constructor
    {
        System.out.println("I am with two parameter");
    }
    public static void main(String[] args) 
}