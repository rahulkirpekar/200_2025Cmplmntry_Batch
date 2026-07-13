package exceptiontopic;

import java.util.Scanner;

public class TestApp6 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No1 : ");
		int no1 = sc.nextInt();
		
		System.out.println("Enter No2 : ");
		int no2 = sc.nextInt();
		
		int ans = 0;
		
		// Nested try...catch block...Exception Handling---code
		try 
		{
			try 
			{
				// raise Exception---code
				ans = no1 / no2;// Raise Exception---code Crashed
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
			
			try 
			{
				String name = null;
				System.out.println("name.length() : " + name.length());// NullPointerException
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
			
			try 
			{
				int a[] = new int[5];
				a[5] = 100;
				
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
			
			try 
			{
				A objA = new B();
				C ObjC = (C)objA;// ClasscastException
				
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		catch(Exception e) 
		{
			System.out.println("Exception --Catch Block Hanlded Exception");
			e.printStackTrace();// Exception Log
		}
		
		System.out.println("Division : " + ans);
	}
}