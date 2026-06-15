package oops.classobj;

import java.util.Scanner;

/*
	Pure Encapsulation
	--------------------
	1. Data Members(private)
	2. Member Function(public)
*/
public class Student 
{
	// Class Properties = [1. Data Members + 2. Member Function]
	
//	1. Data Members
	private int rno;
	private String name;
	private int std;
	private int marks;

//	 2. Member Function
	public void scanData() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rno : ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Std : ");
		std = sc.nextInt();
		System.out.println("Enter Marks : ");
		marks = sc.nextInt();
	}
	public void dispData() 
	{
		System.out.println(rno+" " + name+" " + std + " " + marks);
	}
}



