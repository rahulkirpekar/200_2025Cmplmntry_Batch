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
		
//------------------------		
// Object Eqiality
//------------------------
		
//		1. referenceWay(==)					
//		--------------------				
				                                                                           
		System.out.println("(name1==name2) : " + (name1==name2));//	true	 
		System.out.println("(name1==name3) : " + (name1==name3));//	false	     
		System.out.println("(name1==name4) : " + (name1==name4));//	true	 
		System.out.println("(name1==name5) : " + (name1==name5));//	false	     
		System.out.println("(name2==name3) : " + (name2==name3));//	false	     
		System.out.println("(name2==name4) : " + (name2==name4));//	true	
		System.out.println("(name2==name5) : " + (name2==name5));// false
		System.out.println("(name3==name4) : " + (name3==name4));// false 
		System.out.println("(name3==name5) : " + (name3==name5));// false 
		System.out.println("(name4==name5) : " + (name4==name5));// false  
		System.out.println("(name5==name6) : " + (name5==name6));// false
	
		
//		2. values Way(equals()) 
//		------------------------
		
		System.out.println("(name1.equals(name2) : "+ name1.equals(name2));// true
		System.out.println("(name1.equals(name3) : "+ name1.equals(name3));// false
		System.out.println("(name1.equals(name4) : "+ name1.equals(name4));// true
		System.out.println("(name1.equals(name5) : "+ name1.equals(name5));// false
		System.out.println("(name2.equals(name3) : "+ name2.equals(name3));// false
		System.out.println("(name2.equals(name4) : "+ name2.equals(name4));// true
		System.out.println("(name2.equals(name5) : "+ name2.equals(name5));// false
		System.out.println("(name3.equals(name4) : "+ name3.equals(name4));// false 
		System.out.println("(name3.equals(name5) : "+ name3.equals(name5));// false
		System.out.println("(name4.equals(name5) : "+ name4.equals(name5));// false
		System.out.println("(name5.equals(name6) : "+ name5.equals(name6));// true
	}
}
