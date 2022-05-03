public class trycatchexample
{
    public static void main(String arg[])
    {
    int i=50;
    int j=0;
    int data;
    try
    {
        data=i/j;
    }
    catch(ArithmeticException e)
    {
        System.out.println(i/(j+2));
    }
    }

}