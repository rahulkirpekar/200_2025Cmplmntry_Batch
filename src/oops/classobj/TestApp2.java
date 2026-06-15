package oops.classobj;

public class TestApp2 
{
	public static void main(String[] args) 
	{ 
		// Object with Array
		//----------------------
		Student s[] = new Student[3];
		
		for (int i = 0; i < s.length; i++) 
		{
			s[i] = new Student();
			s[i].scanData();
		}
		
		for (int i = 0; i < s.length; i++) 
		{
			s[i].dispData();
		}
	}
}
