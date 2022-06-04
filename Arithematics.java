// object oriented programming
class Arithematics
{
  int  no1;
  int no2;
    Arithematics(int a,int b)
  {
    this.no1=a;
    this.no2=b;
  }



  int Addition()
  {
    int Ans=0;
    Ans = no1+ no2;
    return Ans; 
  }
  
  int Substraction()
  {
    int Ans=0;
    Ans = no1-no2;
    return Ans;
  }
 public static void main(String arg[])
 {
  Arithematics obj1 = new Arithematics(10,20);
  int iRet=0;
   iRet=obj1.Addition();
  System.out.println("Addition of two number is:"+iRet);
  iRet=obj1.Substraction();
  System.out.println("substraction of two number is"+iRet);
 }

}

/*
 public static void main(String arg[])
 {
  Arithematics obj1 = new Arithematics(10,20);
  int iRet=0;
  int iRet=obj1.Addition();
  System.out.println("Addition of two number is:"+iRet);
  iRet=obj1.Substraction();
  System.out.println("substraction of two number is"+iRet);
 }
*/
/*
Arithematics obj1 = new Arithematics(10,20);
int iRet=0;
 iRet=obj1.Addition()
 System.out.println("Addition of two number is "+iRet);
 iRet=obj1.Substraction()
 System.out.println("substraction of two number  is"+iRet);*/



