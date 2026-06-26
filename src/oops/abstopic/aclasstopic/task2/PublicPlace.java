package oops.abstopic.aclasstopic.task2;

public class PublicPlace extends Person
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
