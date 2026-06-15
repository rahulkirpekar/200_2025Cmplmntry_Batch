package oops.inhtopic.mllvlinh;

import java.util.Scanner;

// Multilevel Inheritance
//--------------------------

public class SciStudent extends Student
{
	String subject;
	
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
		System.out.println("Enter marks : ");
		marks = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your Specialisation Subject Name : ");
		subject = sc.nextLine();
	}
	public void dispData() 
	{
		System.out.println(rno +" " + name + " " + std +" " + marks +" " + subject);
	}
}
