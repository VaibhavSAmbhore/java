class Digit1
{
  public static void main(String arg[])
  {
    int ino=7521;
    int iDigit=0;
    while(ino != 0)
    { 
    iDigit = ino % 10;//1
    System.out.println(iDigit);//1
    ino = ino/10; //752
    }
    /*  
    iDigit = ino % 10;
    System.out.println(iDigit);
    ino = ino /10; //75

    iDigit = ino % 10;
    System.out.println(iDigit);
    ino = ino /10;//7

    iDigit = ino %10 ;
    System.out.println(iDigit);
    ino = ino / 10; 
    */



  }
}