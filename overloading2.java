class overloading2
{
  public static void main(String arg[])
  {
    Demo obj = new Demo();
    int iret=0;
    float fret=0;
    iret = obj.add(10,11);
    System.out.println("addition of two integer is"+iret);
    iret= obj.add(11,12,13);
    System.out.println("addition of two integer is"+iret);
    fret = obj.add(10.5f,21);
    System.out.println("addition of two integer is "+fret);
  }
}
 class Demo
 {
  public int add(int x, int y)
  {
    return x+y;
  }
  public int add(int x,int y,int z)
{ 
  return x+y+z;
}
 public float add(float x, int y)
{
  return x+y;
}
}