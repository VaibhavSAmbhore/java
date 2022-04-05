 import java.util.Scanner;
class SimpleInterest{
	public static void main(String arg[])
	{
	  Scanner sc= new Scanner(System.in);

	  System.out.println("Enter amount");
	  int amount=sc.nextInt();

	  System.out.println("enter time");
	  int time=sc.nextInt();

	  System.out.println("enter rate");
	  float rate= sc.nextFloat();

	  float SimpleInterest=(amount*time*rate)/100;
	  System.out.println("simple interest="+SimpleInterest);

	}
}