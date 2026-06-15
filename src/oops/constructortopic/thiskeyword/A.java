package oops.constructortopic.thiskeyword;

public class A 
{
	int no1,no2,no3;
	
	public A() 
	{
		System.out.println("=====A--Default Constructor=====");
	}
	public A(int no1)
	{
		this();
		System.out.println("=====A--ONE PARA Constructor=====");
		this.no1 = no1;		
	}
	public A(int no1,int no2)
	{
		this(no1);
		System.out.println("=====A--TWO PARA Constructor=====");
		this.no2 = no2;		
	}
	public A(int no1,int no2,int no3)
	{
		this(no1,no2);
		System.out.println("=====A--THREE PARA Constructor=====");
		this.no3 = no3;		
	}
	public void dispData() 
	{
		System.out.println("No1 : " + no1+"\nNo2 : " + no2 + "\nNo3 : " +no3);	
	}
	public static void main(String[] args) 
	{
		A obj = new A(10,20,30);
		
		obj.dispData();
	}
}
