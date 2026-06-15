package oops.polymorphism.runtime.task1;

import java.util.Scanner;

public class TestApp1 
{
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
			case 1: person = new Home();// Polymorphism Object / Runtime Polymorphism / Late/Dynamic Binding
					person.getBehave();
					break;
	
			case 2: person = new Org();
					person.getBehave();
					break;
	
			case 3: person = new PublicPlace();
					person.getBehave();
					break;
	
			case 4: person = new School();
					person.getBehave();
					break;
		}
	}
}