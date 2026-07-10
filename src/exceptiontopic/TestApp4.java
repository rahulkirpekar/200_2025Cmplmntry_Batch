package exceptiontopic;

import java.util.Scanner;

public class TestApp4 
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
		}
		catch(ArithmeticException e) 
		{
			System.out.println("ArithmeticException --Catch Block Hanlded Exception");
			e.printStackTrace();// Exception Log
		}
		System.out.println("Division : " + ans);
	}
}
