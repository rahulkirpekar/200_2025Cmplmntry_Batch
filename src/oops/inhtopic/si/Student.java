package oops.inhtopic.si;
import java.util.Scanner;
// Single Inheritance
//---------------------
// Child / Derived / Sub Class
public class Student extends Person
{	
	int rno,std,marks;
	
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
	}
	public void dispData() 
	{
		System.out.println(rno +" " + name + " " + std +" " + marks );
	}
}