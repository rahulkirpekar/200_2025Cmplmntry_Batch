package oops.inhtopic.supertopic;

public class Person 
{
	String name;
	
	public Person() 
	{
		name = "NULL";
		System.out.println("Person-Default Constructor");
	}

	public Person(String name) 
	{
		this.name = name;
		System.out.println("Person-PARA Constructor");
	}
}
