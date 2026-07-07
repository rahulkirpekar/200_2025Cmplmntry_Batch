package stringtopic.stringmethods;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		//			   0123456789012
		String stmt = "This is Java which is developed By James Gosling.";

		int index = stmt.indexOf("which");
		
		System.out.println("index : " + index);
		
		int lastIndex = index;
		
		if(index != -1) 
		{
			for (int i = index; i < stmt.length(); i++) 
			{
				if(stmt.charAt(i) != ' ') 
				{
					lastIndex++;
				}
				else 
				{
					break;
				}
			}
			System.out.println(lastIndex+"--"+stmt.charAt(lastIndex));
			
//			String newStr = stmt.substring(index);
			
					//					    8   ,  12 
			String newStr = stmt.substring(index,lastIndex);
			
			System.out.println("newStr : " + newStr);

		}		
//		String name = "royal";
//		for (int i = 0; i < name.length(); i++) 
//		{
//			System.out.println("name.charAt("+i+") : " + name.charAt(i));
//		}
		
//		System.out.println(name.charAt(1));
//		System.out.println(name.charAt(2));
//		System.out.println(name.charAt(3));
//		System.out.println(name.charAt(4));
		
		
//		System.out.println("name.trim().length() : " + name.trim().length());
//		System.out.println("name.length() : " +name.length());
		
//		String name1 = "royal";
//		String name2 = "ROYAL";
//		System.out.println(name1.equals(name2));// true
//		System.out.println(name1.equalsIgnoreCase(name2));

//		System.out.println(name1.compareTo(name2));
//		System.out.println(name1.compareToIgnoreCase(name2));
		
		
//		String stmt = "This is Java which is developed By James Gosling.";
//		boolean flag = stmt.contains("is");
//		int index = stmt.indexOf("Java");
//		System.out.println("index : " + index);
	}
}
