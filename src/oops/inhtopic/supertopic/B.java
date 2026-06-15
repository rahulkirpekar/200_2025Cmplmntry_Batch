package oops.inhtopic.supertopic;

public class B extends A
{
	int no2;
	B()
	{
		System.out.println("B--Default Constructor");
		no2=20;
	}
	B(int no1,int no2)
	{
		super(no1);
		System.out.println("B--PARA-TWO Args Constructor");
		this.no2 = no2;
	}
	public void dispData() 
	{
		System.out.println("No1 : " + no1 +" \nNo2 : " + no2);
	}
	public static void main(String[] args) 
	{
		B obj = new B(80,90);
		obj.dispData();
	}
}