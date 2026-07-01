package oops.abstopic.interfacetopic.task2;

public class Org implements Person
{
	@Override
	public void getBehave() 
	{
		System.out.println("Org : getBehave() -- Employee Behaviour");
	}
	
	public void getSalary() 
	{
		System.out.println("Org : Employee - getSalary()");
	}
}
