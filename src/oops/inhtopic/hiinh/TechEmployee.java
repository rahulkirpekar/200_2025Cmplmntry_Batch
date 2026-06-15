package oops.inhtopic.hiinh;

import java.util.Scanner;

public class TechEmployee extends Employee
{
	String projectName;
	
	public void scanData() 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter TechEmployee Id : ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter TechEmployee Name : ");
		name = sc.nextLine();		
		System.out.println("Enter TechEmployee Salary : ");
		salary = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter TechEmployee Dsgn : ");
		dsgn = sc.nextLine();		
		System.out.println("Enter TechEmployee projectName : ");
		projectName = sc.nextLine();		
	}
	public void dispData() 
	{
		System.out.println(id+" " + name+" " + salary+" " + dsgn+" " + projectName);
	}
}




