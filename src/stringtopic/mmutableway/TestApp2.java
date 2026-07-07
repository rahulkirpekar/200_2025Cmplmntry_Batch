package stringtopic.mmutableway;

// Mutable Operation
public class TestApp2 
{
	public static void main(String[] args) 
	{
//		StringBuilder sb1 = new StringBuilder("royal");
//		StringBuilder sb2 = new StringBuilder("technosoft");
	
		
		StringBuffer sb1 = new StringBuffer("royal");
		StringBuffer sb2 = new StringBuffer("technosoft");
		
		System.out.println(sb1+"---"+sb1.hashCode());
		System.out.println(sb2+"---"+sb2.hashCode());
				
		// Mutable Operation
		sb1.append(sb2);
		
		System.out.println(sb1+"---"+sb1.hashCode());
		System.out.println(sb2+"---"+sb2.hashCode());
		
	}
}
