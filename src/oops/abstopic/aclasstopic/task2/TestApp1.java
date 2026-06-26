package oops.abstopic.aclasstopic.task2;

import java.util.Scanner;

public class TestApp1 
{
	public static void getPersonByPlace(Person person) 
	{
		person.getBehave();
		
		if(person instanceof School) 
		{
			// Downcasting
			School student = (School)person;
			student.getResult();
		}
		else if(person instanceof Org) 
		{
			// Downcasting
			Org employee = (Org)person;
			employee.getSalary();
		}
		else if(person instanceof PublicPlace) 
		{
			// Downcasting
			PublicPlace citizen = (PublicPlace)person;
			citizen.getPublicEvent();
		}
		else if(person instanceof Home) 
		{
			// Downcasting
			Home child = (Home)person;
			child.getMovieOnTime();
		}
	}
	
	public static void main(String[] args) 
	{
		Person person = null;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter below choice : ");
		System.out.println("1) For Home");
		System.out.println("2) For Org");
		System.out.println("3) For PublicPlace");
		System.out.println("4) For School");
		int choice = sc.nextInt();

		switch (choice) 
		{
			case 1: // Upcasting
					person = new Home();// Polymorphism Object / Runtime Polymorphism / Late/Dynamic Binding
					getPersonByPlace(person);
					break;
	
			case 2: // Upcasting
					person = new Org();
					getPersonByPlace(person);
					break;
	
			case 3: // Upcasting
					person = new PublicPlace();
					getPersonByPlace(person);
					break;
	
			case 4: // Upcasting
					person = new School();
					getPersonByPlace(person);
					break;
		}
	}
}