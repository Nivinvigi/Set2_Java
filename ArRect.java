import java.util.Scanner;

public class ArRect {
	
	String area= "";

	ArRect(double length,double breadth)
	{	
		area=String.format("%.3f", (length*breadth));
	} 
	String returnArea() 
	{
		return this.area;
	}
	
	public static void main(String args[])
	 {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter  length and beadth of the rectangle :");
		double length = scn.nextDouble();
		double breadth=scn.nextDouble();
		ArRect ob = new ArRect(length,breadth);
		String area = "";
		area=ob.returnArea();
		
		System.out.println("Area of rectangle = "+area);
		
		
	}

	
}