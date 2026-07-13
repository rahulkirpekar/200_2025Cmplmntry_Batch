package exceptiontopic;

import java.util.Scanner;

// try ... with Multiple catch block
//--------------------------------------
public class TestApp5 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No1 : ");
		int no1 = sc.nextInt();
		
		System.out.println("Enter No2 : ");
		int no2 = sc.nextInt();
		
		int ans = 0;
		
		// Exception Handling---code
		try 
		{
			// raise Exception---code
			ans = no1 / no2;// Raise Exception---code Crashed
			
			String name = null;
			System.out.println("name.length() : " + name.length());// NullPointerException
			
			int a[] = new int[5];
			a[5] = 100;
			
			
			A objA = new B();
			C ObjC = (C)objA;// ClasscastException
			
		}
		catch(ArithmeticException e) 
		{
			System.out.println("ArithmeticException --Catch Block Hanlded Exception");
			e.printStackTrace();// Exception Log
		}
		catch(NullPointerException e) 
		{
			System.out.println("NullPointerException --Catch Block Hanlded Exception");
			e.printStackTrace();// Exception Log
		}
		catch(ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("ArrayIndexOutOfBoundsException --Catch Block Hanlded Exception");
			e.printStackTrace();// Exception Log
		}
		catch(Exception e) 
		{
			System.out.println("Exception --Catch Block Hanlded Exception");
			e.printStackTrace();// Exception Log
		}
		
		System.out.println("Division : " + ans);
	}
}
