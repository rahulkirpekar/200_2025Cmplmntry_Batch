package oops.inhtopic.supertopic;

public class A 
{
	int no1;
	
	public A()
	{
		System.out.println("A--Default Constructor");
		no1=10;
	}
	public A(int no1)
	{
		System.out.println("A--PARA-ONE Args Constructor");
		this.no1 = no1;
	}
}
