package oops.inhtopic.hiinh;

import java.util.Scanner;

public class ManagementEmployee extends Employee
{
	String managementTask;
	
	public void scanData() 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter ManagementEmployee Id : ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter ManagementEmployee Name : ");
		name = sc.nextLine();		
		System.out.println("Enter ManagementEmployee Salary : ");
		salary = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter ManagementEmployee Dsgn : ");
		dsgn = sc.nextLine();		
		System.out.println("Enter ManagementEmployee Management Task : ");
		managementTask = sc.nextLine();		
	}
	public void dispData() 
	{
		System.out.println(id+" " + name+" " + salary+" " + dsgn+" " + managementTask);
	}
}
