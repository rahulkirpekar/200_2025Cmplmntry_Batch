package oops.classobj;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// obj1 - reference(pointer) variable
		
		Student obj1 = new Student();
		Student obj2 = new Student();
		
		obj1.scanData();
		obj2.scanData();
		
		obj1.dispData();
		obj2.dispData();
	}
}
