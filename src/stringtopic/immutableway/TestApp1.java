package stringtopic.immutableway;

public class TestApp1 
{
	public static void main(String[] args) 
	{
//		String n1 = "ab";
//		String n2 = "cd";
//		String n3 ="abcd";
//		String n4 = n1.concat(n2);//abcd
//		System.out.println("n3.hashCode() : " + n3.hashCode());
//		System.out.println("n4.hashCode() : " + n4.hashCode());		
//		System.out.println("(n3 == n4) : " + (n3 == n4));
		
		
		String name1 = "Royal";
		String name2 = "Royal";
		String name3 = "technosoft";
		String name4 = name1;

		String name5 = name1.concat(name3);// Royaltechnosoft
		String name6 = "Royaltechnosoft";
				
		System.out.println(name5==name6);


	}
}
