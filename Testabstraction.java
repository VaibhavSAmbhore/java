abstract class shape
{
	abstract void fun();
}
  class rectangle  extends shape
 {
   void fun()
   {
   System.out.println("drawing bus");
   }
 }
    class circle  extends shape
  {
   void fun()
   {
    System.out.println("inside bus");
   }
  }
  class Testabstraction
  {
   public static void main(String arg[])
   {
   shape obj = new circle();
   obj.fun(); 
   }
    }