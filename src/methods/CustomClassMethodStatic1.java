package methods;

import java.util.Scanner;
class  CustomClassMethodStatic1
{
	public static void main(String[] args) 
	{
		System.out.println("MAIN CLASS METHOD STARTED");
		Scanner sc = new Scanner (System.in);
			
		EmpDetails emp = new EmpDetails();
							
		System.out.println("Enter the Employee Name:");
		emp.empname = sc.nextLine();

		System.out.println("Enter the Employee ID:");
		emp.empid = sc.nextInt();

		System.out.println("Enter the Employee Designation:");
		emp.empdesi = sc.next();

		System.out.println("Enter the Employee Salary:");
		emp.empsal = sc.nextDouble();

		System.out.println("Enter the Employee Contact No:");
		emp.empmobno = sc.nextLong();

		System.out.println("Enter the Employee Branch:");
		emp.empbranch = sc.next();

		System.out.println("Enter the Employee City:");
		emp.empcity = sc.next();
		
		
		System.out.println("EMPLOYEE DETAILS");
		System.out.println("________________________");
		emp.empinfo();
		System.out.println("________________________");

		System.out.println("EMPLOYEE DETAILS");
		System.out.println("________________________");
		System.out.println("After Increaments");
		emp.empsal = emp.empsal + emp.empsal * 0.5;
		emp.empinfo();
		System.out.println("________________________");

		emp.empinfo1();

		EmpDetails emp1 = emp; // Refering the emp records to another variable emp1 as well.  so that emp and emp1 is having same data's
		
	}
}

class EmpDetails
{
	int empid;
	String empname, empbranch,empcity, empdesi;
	double empsal;
	long empmobno;

	void empinfo()
	{
		//System.out.println("SUB CLASS METHOD STARTED");
		System.out.println("Employee Name: " +empname);
		System.out.println("Employee ID: " +empid);
		System.out.println("Employee ID: " +empdesi);
		System.out.println("Employee Salary: " +empsal);
		System.out.println("Employee Mobile: " +empmobno);
		System.out.println("Employee Branch: " +empbranch);
		System.out.println("Employee City: " +empcity);
	}

	void empinfo1()
	{
		System.out.println(empname + " is working at " + empbranch + " in " +empcity + " as " +empdesi );
	}

}