public class Triangle
{
	public Triangle() 
{
		double perimeter;
		double area;
		int s1=3,s2=4,s3=5; //sides
		
		perimeter=s1+s2+s3;
		//finding semi perimeter
		double halfP = perimeter/2;
		//Using Heron's Formula to calculate Area 
		area=Math.sqrt(halfP*(halfP-s1)*(halfP-s2)*(halfP-s3));
		
		System.out.println("Perimeter Of Triangle with sides 3,4,5 = "+perimeter);
		System.out.println("Area Of the Triangle = "+area);
		
	}
	public static void main(String[] args) 
	{
		Triangle obj = new Triangle();
	}
}