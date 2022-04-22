class StaticBlock
{
	static
	{
	System.out.println("static block of main");
	}
	public static void main(String arg[])
	{
	 System.out.println("inside main");
	 Demo obj1 = new Demo();
	 Demo obj2 = new Demo();
	}
}
  class Demo
  {
   public int i,j;
   public static int x,y;
   static 
   {
    System.out.println("inside  static block");
    x=10;
    y=20;
   }
   public Demo()
   {
    System.out.println("inside constructor");
    i=10;
    j=20;
   }
  }