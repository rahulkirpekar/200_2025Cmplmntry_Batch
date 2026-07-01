package oops.abstopic.interfacetopic.task2;

public class PublicPlace implements Person
{
	@Override
	public void getBehave() 
	{
		System.out.println("PublicPlace : getBehave() -- Citizen Behaviour");
	}
	
	public void getPublicEvent() 
	{
		System.out.println("PublicPlace : Citizen - getPublicEvent()");
	}
}
