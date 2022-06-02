import java.util.*;
class Return
{
  public static void main(String arg[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number");
    int ino = sc.nextInt();
   // if ( int ino < 0)
  //  {
  //    ino =-ino;
  //  }
   int i;
    for(i=ino;i>=1;i--)
    {
      System.out.println(i);
    }
  }
}