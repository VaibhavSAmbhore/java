import java.util.*;
class command
{
    public static void main(String arg[])
    {
        System.out.println("total number of argument are"+arg);
        System.out.println("command line argument are:");
         for (int i=0;i<arg.length;i++)
         {
             System.out.println(arg[i]);
         }
    }
}