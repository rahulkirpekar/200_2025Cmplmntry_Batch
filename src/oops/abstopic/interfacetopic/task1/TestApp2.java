package oops.abstopic.interfacetopic.task1;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		A obj = new D();
		
//		obj.test7();
//		obj.test8();
//		obj.test9();
//		obj.test10();
		
		
		obj.test1();
		obj.test2();
		obj.test3();
		
		obj.test5();
		A.test6();
		
		if(obj instanceof D) 
		{
			D objD = (D)obj;
			objD.test7();
			objD.test8();
			objD.test9();
			objD.test10();
		}
	}
}
