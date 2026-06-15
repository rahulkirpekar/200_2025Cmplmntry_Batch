package basic;

import java.util.Scanner;

public class TestApp5 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int a[][] = new int[3][5];
/*
 * 		int a[][] = new int[3][5];
 *    	int [][]a = new int[3][5];
 *     	int []a[] = new int[3][5];
 *      int[][] a = new int[3][5];
 *      int [][] a = new int[3][5];
 *      
 *      int a[][] = null;
 *      a = new int[3][5];
 * 
 * */		
		
		int a1[][] = 
				{
						{10,20,30,40,50},	
						{10,20,30,40,50},	
						{10,20,30,40,50}	
				};
		

		int a2[][] = new int[][]
					{
							{10,20,30,40,50},	
							{10,20,30,40,50},	
							{10,20,30,40,50}	
					};
	

		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				System.out.println("Enter A["+i+"]["+j+"] : ");
				a[i][j] = sc.nextInt(); 
			}
		}
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				System.out.println("A["+i+"]["+j+"] : " + a[i][j]);
			}
		}
	}
}
