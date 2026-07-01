package oops.abstopic.interfacetopic.task2;

public class School implements Person
{
	@Override
	public void getBehave() 
	{
		System.out.println("School : getBehave() -- Student Behaviour");
	}
	public void getResult() 
	{
		System.out.println("School : Student - getResult()");
	}
}
