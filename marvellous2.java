import java.util.*;
class Marvellous2
{
  public static void main(String arg[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number");
    int ino = sc.nextInt();
    if (ino<0)
    {
      ino =-ino;
    }
    for(int i=1;i<=ino; i++)
    {
      System.out.println(i);
    }
  }
}