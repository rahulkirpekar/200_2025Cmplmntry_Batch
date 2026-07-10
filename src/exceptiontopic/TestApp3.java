package exceptiontopic;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		A obj = new B();
		
		C objC = (C)obj;// ClasscastException
	}
}
