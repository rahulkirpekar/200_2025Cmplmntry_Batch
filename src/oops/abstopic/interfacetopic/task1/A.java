package oops.abstopic.interfacetopic.task1;

// 100% Abstraction 
//-----------------------

public interface A 
{
// 1. Constant Variables(public static final)
	public static int NO = 10;// public static final 
	
// 2. methods
//------------
// 1.Abstract Method(Abstraction)---[public abstract]
//-------------------------------------------------------------------
	void test1();// public abstract	
	public void test2();// abstract	
	abstract void test3();// public 
	
// 2.Non-Abstract Method(static--8,default--8,private--9)// java-8	
//-------------------------------------------------------------------
	private void test4() 
	{
		System.out.println("test4(private method)");
	}
	default void test5() 
	{
		test4(); 
		System.out.println("test5(default method)");
	}
	public static void test6() 
	{
		System.out.println("test6(static method)");
	}
}
