import java.util.*;
class Digit3
{
  public static void main(String arg[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number");
    int ino = sc.nextInt();
   // int ino=7521;
    int iDigit=0;
    int isum=0;
    while(ino != 0)
    { 
    iDigit = ino % 10;//1
    isum = isum + iDigit;
    ino = ino/10; //752
   // System.out.println("Addition of two number is "+isum);
    }
   
    System.out.println("Addition of two number is "+isum);
  
  }
}