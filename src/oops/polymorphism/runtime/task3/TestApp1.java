package oops.polymorphism.runtime.task3;

public class TestApp1 
{
	public static void getMethod(A objA) 
	{
		objA.test1();
		
		if(objA instanceof B) 
		{
			// Downcasting (Child Reference <=== Parent Reference )
			B objB = (B)objA;
			objB.testB();
		}
		else if(objA instanceof C) 
		{
			// Downcasting
			C objC = (C)objA;
			objC.testC();
		}
		else if(objA instanceof D) 
		{
			// Downcasting
			D objD = (D)objA;
			objD.testD();
		}
	}
	
	public static void main(String[] args) 
	{
		
		// Polymorphisc Object
		// (Parent reference= Child Object)
		A objA = new B();
		getMethod(objA);
		
		System.out.println("--------------------");
		
		objA = new C();
		getMethod(objA);
		
		System.out.println("--------------------");
		
		objA = new D();
		getMethod(objA);
		
	}
}
