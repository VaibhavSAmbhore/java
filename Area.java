import java.util.Scanner;

class Area{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the  plotlenght");
		double plotlenght = sc.nextDouble();
		System.out.println("enter the plotwidth");
		double plotwidth= sc.nextDouble();
		System.out.println("enter the construction lenght");
		double conslenght= sc.nextDouble();
		System.out.println("enter the construction width");
		double conswidth= sc.nextDouble();
		double openArea= calculateArea(plotlenght,plotwidth,conslenght,conswidth);
		System.out.println("open Area:"+openArea);

	}
	public static double calculateArea(double plotlenght,double plotwidth,double conslenght,double conswidth )
	{
	  double openArea=0;
	  openArea= plotlenght*plotwidth-conslenght*conswidth;
	  return openArea;
    }
}