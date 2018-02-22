package collectionsConcept;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class CollectionTreeSetConcept5 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		TreeSet TS = new TreeSet();
		
		EmployeeIT EIT1 = new EmployeeIT(10, "Saravanan", 10000, "Bangalore", "Engineer");
		EmployeeIT EIT2 = new EmployeeIT(20, "Santhosh", 19000, "Chennai", "Tester");
		EmployeeIT EIT3 = new EmployeeIT(40, "Suresh", 16000, "Mumbai", "Lawyer");
		EmployeeIT EIT4 = new EmployeeIT(30, "Manjari", 20000, "Banglalore", "Manager");
		EmployeeIT EIT5 = new EmployeeIT(60, "Anita", 24000, "Bangalore", "Engineer");
		EmployeeIT EIT6 = new EmployeeIT(50, "Ekambar", 35000, "Salem", "Owner");
		
		TS.add(EIT1); TS.add(EIT2); TS.add(EIT3); TS.add(EIT4); TS.add(EIT5); TS.add(EIT6);
		
		System.out.println("Enter 0 For Display Records Acdening by ID:");
		System.out.println("Enter 1 For Display Records Ascedning by Name:"); 
		System.out.println("Enter 2 For Display Records Ascedning by Salary:"); 
		System.out.println("Enter 3 For Display Records Ascedning by Location:"); 
		System.out.println("Enter 4 For Display Records Ascedning by Designation:"); 
		
		int key = sc.nextInt();
		
		switch (key) 
		{
		case 1:	TreeSet TS1 = new TreeSet(new AscbyNAME());
				TS1.addAll(TS);
				System.out.println("<-------------------------------------SORT BY NAME--------------------------------------->");
				for (Object object : TS1) 
				{
					System.out.println(object);
				}
				break;
				
		case 2: TreeSet TS2 = new TreeSet(new AscbySAL());
				TS2.addAll(TS);
				System.out.println("<-------------------------------------SORT BY SALARY (High to Low)-------------------------->");
				for (Object object : TS2) 
				{
					System.out.println(object);
				}
				break;
		
		case 3: TreeSet TS3 = new TreeSet(new AscbyLOC() );
				TS3.addAll(TS);
				System.out.println("<-------------------------------------SORT BY LOCATION------------------------------------>");
				for (Object object : TS3) 
				{
					System.out.println(object);
				}
				break;	
		
		case 4: TreeSet TS4 = new TreeSet(new AscbyDesg());
				TS4.addAll(TS);
				System.out.println("<-------------------------------------SORT BY DESGINATION----------------------------------->");
				for (Object object : TS4) 
				{
					System.out.println(object);
				}
				break;

		default:System.out.println("<-------------------------------------SORT BY ID---------------------------------------->");
				for (Object object : TS) 
				{
					System.out.println(object);
				} 
				break;
		}
			
	}
}

class EmployeeIT implements Comparable
{
	int empid;
	String empname;
	int empsal;
	String emploc;
	String empdesg;
	
	public EmployeeIT(int empid, String empname, int empsal, String emploc, String empdesg) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsal = empsal;
		this.emploc = emploc;
		this.empdesg = empdesg;
	}

	@Override
	public String toString() {
		return "EmployeeIT [empid=" + empid + ", empname=" + empname + ", empsal=" + empsal + ", emploc=" + emploc
				+ ", empdesg=" + empdesg + "]";
	}

	@Override
	public int compareTo(Object obj) 
	{
		EmployeeIT eit = (EmployeeIT)obj;
		return this.empid - eit.empid;
	}

	
}

class AscbyNAME implements Comparator
{
	@Override
	public int compare(Object obj1, Object obj2) 
	{
		EmployeeIT eit1 = (EmployeeIT)obj1;
		EmployeeIT eit2 = (EmployeeIT)obj2;
		return eit1.empname.compareTo(eit2.empname);
	}
}

class AscbySAL implements Comparator
{
	@Override
	public int compare(Object obj1, Object obj2) 
	{
		EmployeeIT eit1 = (EmployeeIT)obj1;
		EmployeeIT eit2 = (EmployeeIT)obj2;
		return -eit1.empsal - eit2.empsal;
	}	
}

class AscbyLOC implements Comparator
{
	@Override
	public int compare(Object obj1, Object obj2) 
	{
		EmployeeIT eit1 = (EmployeeIT)obj1;
		EmployeeIT eit2 = (EmployeeIT)obj2;
		int i = eit1.emploc.compareTo(eit2.emploc);
		if( i < 0)
			return i;
		else 
			return 1;
	}	
}

class AscbyDesg implements Comparator
{
	@Override
	public int compare(Object obj1, Object obj2) 
	{
		EmployeeIT eit1 = (EmployeeIT)obj1;
		EmployeeIT eit2 = (EmployeeIT)obj2;
		int i=eit1.empdesg.compareTo(eit2.empdesg);
		if(i < 0)
			return i;
		else
			return 1;
	}	
}
