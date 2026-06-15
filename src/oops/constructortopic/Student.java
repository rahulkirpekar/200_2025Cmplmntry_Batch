package oops.constructortopic;

// Constructor Overloadding
public class Student 
{
	// 1. Data Members--private
	int rno;
	String name;
	int std;
	int marks;

	// 1. Default Constructor---Special Function
	Student()
	{
		System.out.println("===== STATRT : Default Constructor====");
		
		rno = 0;
		name = "NONAME";
		std = 0;
		marks = 0;
		
		System.out.println("===== EXIT : Default Constructor====");
	}
	
	// 2. Para Constructor---Three
	Student(int r,String n,int s)
	{
		System.out.println("===== STATRT : PARA--Three Constructor====");
		dispData();
		
		rno  = r;
		name =  n ; 
		std  = s;
		
		dispData();

		System.out.println("===== EXIT : PARA--Three Constructor====");
	}
		
	// 2. Para Constructor---Four
	Student(int r,String n,int s,int m)
	{
		System.out.println("===== STATRT : PARA--Four Constructor====");
		dispData();
		
		rno = r;
		name=  n ; 
		std =s;
		marks = m;
		dispData();

		System.out.println("===== EXIT : PARA--Four Constructor====");
	}
	
	// Para(Copy) Constructor
	Student(Student s)
	{
		System.out.println("===== STATRT : PARA(COPY)--Four Constructor====");
		dispData();
		
		rno = s.rno;
		name=  s.name ; 
		std 	= s.std;
		marks = s.marks;
		dispData();

		System.out.println("===== EXIT : PARA(COPY)--Four Constructor====");
	}
	
	// 2. Member Function---public
	void dispData() 
	{
		System.out.println(rno+" " + name+" "  + std+" " + marks);
	}
}
