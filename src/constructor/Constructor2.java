package constructor;

class Constructor2
{
	public static void main(String[] args) 
	{
		EmpDetails ed1 = new EmpDetails(123,"Sara","SJP","Bangalore","Engineer",10000,953588);
		ed1.empinfo();
		ed1.empinfo1();
		
	}
}

class EmpDetails
{
	int empid;
	String empname, empbranch,empcity, empdesi;
	double empsal;
	long empmobno;

	EmpDetails(int empid, String empname, String ebranch, String ecity, String edesi, double esal, long emob)
	{
		this.empid = empid; // this keyword used to differenciate between local and global variable. Left side: Global variable = RightSide:Local veriable
		// empname = this.ename; // we can not use like this.
		this.empname = empname;
		empbranch = ebranch;
		empcity = ecity;
		empdesi = edesi;
		empsal = esal;
		empmobno = emob;
	}

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