package stringtopic.mmutableway;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		String name1 = "royal";
		String name2 = "technosoft";
		
						// Immutable
		String name3 = name1.concat(name2);
		
		System.out.println(name1+"---"+name1.hashCode());
		System.out.println(name2+"---"+name2.hashCode());
		System.out.println(name3+"---"+name3.hashCode());
		
	}
}
