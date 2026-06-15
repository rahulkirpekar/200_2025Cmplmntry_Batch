package oops.inhtopic.supertopic;

public class Employee extends Person
{
	int id;
	int salary;
	String dsgn;
	
	public Employee() 
	{
		System.out.println("Employee-Default Constructor");
		id = 0;
		salary = 0;
		dsgn = "NULL";
	}
	
	public Employee(int id,String name,int salary,String dsgn)
	{
		super(name);
		System.out.println("Employee-PARA Constructor");
		this.id = id;
		this.salary = salary;
		this.dsgn = dsgn;
	}
	public void dispData() 
	{
		System.out.println(id+" " + name+" " + salary+" " + dsgn);
	}
	
	public static void main(String[] args) 
	{
		Employee  e= new Employee(1,"Ganesh",90000,"SE");
		
		e.dispData();
	}
}
