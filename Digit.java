class Digit
{
  public static void main(String arg[])
  {
    int ino=7521;
    int iDigit=0;
    iDigit = ino %10;
    System.out.println(iDigit);
    ino = ino /10; //752

    iDigit = ino % 10;
    System.out.println(iDigit);
    ino = ino /10; //75

    iDigit = ino % 10;
    System.out.println(iDigit);
    ino = ino /10;//7

    iDigit = ino %10 ;
    System.out.println(iDigit);
    ino = ino / 10; 




  }
}