public class overload 
{
    void show()
    {
        System.out.println("I am Zero");
    }
    int show(int x)
    {
        System.out.println("I am One"+x);
        return 0;
    }
    void show(double x)
    {
        System.out.println("I am double"+x);

    }
    void show (float x)
    {
        System.out.println("I am float");
    }
    public static void main(String[] args) 
    {
        overload o1=new overload();
        o1.show(6.90);
        o1.show(6.90f);
        o1.show(6);
    }
}
