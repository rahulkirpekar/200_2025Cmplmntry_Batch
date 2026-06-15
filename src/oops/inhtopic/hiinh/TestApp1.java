package oops.inhtopic.hiinh;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		TechEmployee techEmp = new TechEmployee();
		
		techEmp.scanData();
		techEmp.dispData();
		
		ManagementEmployee mgmtEmp = new ManagementEmployee();
		
		mgmtEmp.scanData();
		mgmtEmp.dispData();
		
	}
}
