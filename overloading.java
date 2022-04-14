import java.lang.*;

class overloading
{
	public static void main(String arg[])
	{
		Demo obj = new Demo();
		int iret=0;
	 float fret= 0.0F;

		iret = obj.Add(10,11);
		System.out.println("addition of 2 Integers:"+iret);

		fret =obj.Add(10.5f,11.3f);
		System.out.println("addition of 2 Float:"+fret);

	}
}
     class Demo
{ 
  	//overloading by changing data type
  
  	public int Add(int no1,int no2)
  {
  	return no1+no2;
  	}
      public float Add(float no1,float no2)
    {
      	return no1+no2;
     }
  	
}
 