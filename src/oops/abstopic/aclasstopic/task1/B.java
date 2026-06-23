package oops.abstopic.aclasstopic.task1;

public abstract class B extends A
{
	int no2;
	
	public B() 
	{
		no2=20;
		System.out.println("B : Default Constructor No2 : " + no2);
	}
	public B(int no1,int no2)
	{
		this.no2 = no2;
	}
	
	@Override
	public void test1() 
	{
		System.out.println("B : test1()");
	}
	@Override
	public void test2() 
	{
		System.out.println("B : test2()");
	}
	public abstract void testB();
}
