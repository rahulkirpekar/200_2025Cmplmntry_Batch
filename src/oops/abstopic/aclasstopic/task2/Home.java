package oops.abstopic.aclasstopic.task2;

public class Home extends Person
{
	@Override
	public void getBehave() 
	{
		System.out.println("Home : getBehave() -- Child Behaviour");
	}
	
	public void getMovieOnTime() 
	{
		System.out.println("Home : Child - getMovieOnTime()");
	}
}
