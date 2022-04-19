class FinalChar
{
	public static void main(String arg[])
	{
		Demo obj = new Demo();
       System.out.println("values of j:"+obj.j);
	}
}
  class Demo
  {
   public int i;
   public final int j=10;

   public Demo()
   {
   	i=20;
   	//j=11; not appicalbel deu to final method
   }

  }   
