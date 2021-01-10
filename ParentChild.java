class Parent
{
	
	void display1() {
		System.out.println("This is Parent class");
	}
}
	
class Child extends Parent
{
	void display2() 
	{
			System.out.println("This is Child class");
	}
}
	
public class ParentChild 
{
	public static void main(String[] args) 
{
		
		//calling method of parent class by object of parent class
		Parent ob1 = new Parent();
		ob1.display1();
		
		//calling method of child class by object of child class
		Child ob2 = new Child();
		ob2.display2();
		
		
		
		//calling method of parent class by object of child class
		ob2.display1();
		
		
		
		
	}
}
	