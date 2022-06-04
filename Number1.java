 import java.util.*;
class Number1
{
  public static void main(String arg[])
  {
    Scanner sc = new Scanner(System.in);
    int ino = sc.nextInt();
    
   // int ino =100;
    int isum=0;
    int i=1;
    while(i<=ino)
    {
      isum = isum + i;
      i++;
    }
    System.out.println(isum);
  }
}