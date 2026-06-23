package oops.classexecutionflow;
/*
---------------------------------
Order of CLass Execution Flow:-
---------------------------------
	1. Static Block : 1
	2. Static Block : 2
	3. START :: Main Function
	4. static staticMethod method
	5. Instance Block : 1
	6. Instance Block : 2
	7. Defult Constructor
	7. PARA Constructor(One args) : 10
	8. Non-static nonStaticMethod() method
	9. EXIT :: Main Function

*/
public class Student 
{
	static 
	{
		System.out.println("1. Static Block : 1");
	}
	static 
	{
		System.out.println("2. Static Block : 2");
	}

	// Instance Block
	{
		System.out.println("5. Instance Block : 1");
	}
	{
		System.out.println("6. Instance Block : 2");
	}
	
	public Student() 
	{
		System.out.println("7. Defult Constructor");
	}
	public Student(int no) 
	{
		this();
		System.out.println("7. PARA Constructor(One args) : " + no);
	}
	
	static void staticMethod() 
	{
		System.out.println("4. static staticMethod method");
	}
	void nonStaticMethod() 
	{
		System.out.println("8. Non-static nonStaticMethod() method");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("3. START :: Main Function");
	
		Student.staticMethod();
		
		Student obj = new Student(10);
		
		obj.nonStaticMethod();
		
		System.out.println("9. EXIT :: Main Function");
	}
}

