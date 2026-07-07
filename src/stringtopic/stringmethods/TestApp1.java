package stringtopic.stringmethods;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		//			  01234
		String name= "royal";
		
		System.out.println("name.length() : " + name.length());
		
//		char value = name.charAt(0);
//		System.out.println("value : " + value);
		
		for (int i = 0; i < name.length(); i++) 
		{
			char value = name.charAt(i);
			System.out.println("value : " + value);
		}
	}
}
