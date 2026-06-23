package oops.finaltopic;

public class TestApp1 
{
	// Data Members
	final int no1 ;// = 1000;
	
	public TestApp1() 
	{
		no1 = 100;
	}
	
	public TestApp1(int no1) 
	{
		this.no1 = no1;
	}
	
	public static void main(String[] args) 
	{	
		TestApp1 obj = new TestApp1(5000);
		
//		obj.no1=1000;// C.E
		System.out.println("obj.no1 : " + obj.no1);
		
//		obj.no1=20;
//		System.out.println("obj.no1 : " + obj.no1);
		
		
		// Local Variable
//		final int no = 100;
//		System.out.println("No : "+ no);

//		no = 100;// C.E
//		System.out.println("No : "+ no);
	}
}
