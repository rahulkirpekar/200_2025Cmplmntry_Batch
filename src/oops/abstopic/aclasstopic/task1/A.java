package oops.abstopic.aclasstopic.task1;

public abstract class A 
{
//	1.Data Members
	int no1;
	
//	2.constructors
	A()
	{
		no1=10;
		System.out.println("A : Default Constructor No1 : " + no1);
	}
	A(int no1)
	{
		this.no1 = no1;
		System.out.println(" Constructor : Para-ONE No1 : " + no1);
	}
	
//	3.method
//		1. Abstract methods
//		-------------------------
		public abstract void test1();
		public abstract void test2();
		public abstract void test3();

//		2. Non-abstract methods
//		-------------------------
		public void test4()
		{
			System.out.println("A : test4()");
		}
}
