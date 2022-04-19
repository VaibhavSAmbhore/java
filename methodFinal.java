class methodFinal
{
	public static void main(String arg[])
	{
      Base obj = new Base();
      obj.gun();
    //  obj.fun();
      Derived dobj = new Derived();
    //  obj.gub();
      obj.fun();
	}
}

 class Base
 {
 	public void gun()
 	{}

 	final void fun()
 {}
 	
 }
 class Derived extends Base {
 	public void gun(){}
 	public void fun(){}
 }