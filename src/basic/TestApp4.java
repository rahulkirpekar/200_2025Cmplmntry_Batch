package basic;

import java.util.Scanner;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		int a[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("Enter A["+ i +"] : ");
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) 
		{
			sum = sum + a[i];
			System.out.println("A["+ i +"] : " + a[i] );
		}
		System.out.println("Sum : " + sum);
	}
}