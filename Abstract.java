 abstract class bike
{
	abstract void run();

}

 class cycle extends bike
 {
   public int x,y;
   public void run()
   {
    System.out.println("inside void run");
   }
   public static void main(String arg[])
   {
    bike obj = new cycle();
    obj.run();
   }
}