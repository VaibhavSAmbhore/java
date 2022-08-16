class Arithematic
{
  public int ino1;
  public int ino2;
  public Arithematic()
  {
    this.ino1=0;
    this.ino2=0;
  }
  public Arithematic(int x, int y)

  {
    this.ino1=x;
    this.ino2=y;
  }
  public int Addition()
  {
    int ans=0;
    ans=this.ino1 + this.ino2;
    return ans;
  }
   public int Substraction()
   {
    int ans=0;
    ans= this.ino1 - this.ino2;
    return ans;
   }
   public int Multiplication()
   {
    int ans=0;
    ans= this.ino1 * this.ino2;
    return ans;
   }
   public int division
   {
    int ans=0;
    ans= this.ino1 / this.ino2;
    return ans;
   }


}

class Luthfer
{
  public static void main(String arg[])
  {
    System.out.println("inside main");
    Arithematic obj1 = new Arithematic();
    Arithematic obj2 = new Arithematic(21,22);
    int iret =0;
     iret = obj2.Addition();
     System.out.println("addition of number is" +iret); 
     iret = obj2.Substraction();
     System.out.println("substraction is " +iret);
     iret = obj2.Multiplication();
     System.out.println("multiplication of two number is" + iret);
     iret = obj2.division();
     System.out.println("division of two nummber" + iret);

  }
}