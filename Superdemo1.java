class Superdemo1
{
  public static void main(String arg[])
  {
    Derived dobj = new Derived();
    dobj.fun();
  }
}
class Base
{
  public int x,y;
  public Base (int a,int b)
  {
    this.x=a;
    this.y=b;
    System.out.println("Base constructor");
  }
  public void gun()
  {
    System.out.println("Base gun");
  }
}

 class  Derived extends Base
 {
  public int a,b;
  public Derived() // Base(11,12)
  {
    super(11,21);
    System.out.println("Derived constructor");
  }
  public void fun()
  {
    System.out.println("value of x:"+super.x);
    super.gun();
  }
 }