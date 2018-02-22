package collectionsConcept;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class CollectionTreeSetConcept6
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		TreeSet TSE = new TreeSet();
		TreeSet TSS	= new TreeSet();
		
		
		EmployeesIT EIT1 = new EmployeesIT(10, "Saravanan", 10000, "Bangalore", "Engineer");
		EmployeesIT EIT2 = new EmployeesIT(20, "Santhosh", 19000, "Chennai", "Tester");
		EmployeesIT EIT3 = new EmployeesIT(40, "Suresh", 16000, "Mumbai", "Lawyer");
		EmployeesIT EIT4 = new EmployeesIT(30, "Manjari", 20000, "Banglalore", "Manager");
		EmployeesIT EIT5 = new EmployeesIT(60, "Anita", 24000, "Bangalore", "Engineer");
		EmployeesIT EIT6 = new EmployeesIT(50, "Ekambar", 35000, "Salem", "Owner");
		TSE.add(EIT1); TSE.add(EIT2); TSE.add(EIT3); TSE.add(EIT4); TSE.add(EIT5); TSE.add(EIT6);
		
		StudentsIT SIT1 = new StudentsIT(100, "Saravanan", 60, "Bangalore");
		StudentsIT SIT2 = new StudentsIT(200, "Srikanth", 70, "Chennai");
		StudentsIT SIT3 = new StudentsIT(500, "Ramesh", 65, "Kolkatta");
		StudentsIT SIT4 = new StudentsIT(300, "Jeshani", 50, "Mangalore");
		StudentsIT SIT5 = new StudentsIT(600, "Preethi", 85, "Chennai");
		StudentsIT SIT6 = new StudentsIT(400, "Karthini", 90, "Kerala");
		TSS.add(SIT1); TSS.add(SIT2); TSS.add(SIT3); TSS.add(SIT4); TSS.add(SIT5);TSS.add(SIT6);
		
		System.out.println("Enter 0 For Display Records Acdening by ID:");
		System.out.println("Enter 1 For Display Records Ascedning by Name:"); 
//		System.out.println("Enter 2 For Display Records Ascedning by Salary:"); 
//		System.out.println("Enter 3 For Display Records Ascedning by Location:"); 
//		System.out.println("Enter 4 For Display Records Ascedning by Designation:"); 
		
		int key = sc.nextInt();
		
		switch (key) 
		{
		case 1:	TreeSet TS1 = new TreeSet(new AscNAME());
				TS1.addAll(TSE); TS1.addAll(TSS);
				System.out.println("<-------------------------------------SORT BY NAME--------------------------------------->");
				for (Object object : TS1) 
				{
					System.out.println(object);
				}
				break;
				
//		case 2: TreeSet TS2 = new TreeSet(new AscbySAL());
//				TS2.addAll(TS);
//				System.out.println("<-------------------------------------SORT BY SALARY (High to Low)-------------------------->");
//				for (Object object : TS2) 
//				{
//					System.out.println(object);
//				}
//				break;
//		
//		case 3: TreeSet TS3 = new TreeSet(new AscbyLOC() );
//				TS3.addAll(TS);
//				System.out.println("<-------------------------------------SORT BY LOCATION------------------------------------>");
//				for (Object object : TS3) 
//				{
//					System.out.println(object);
//				}
//				break;	
//		
//		case 4: TreeSet TS4 = new TreeSet(new AscbyDesg());
//				TS4.addAll(TS);
//				System.out.println("<-------------------------------------SORT BY DESGINATION----------------------------------->");
//				for (Object object : TS4) 
//				{
//					System.out.println(object);
//				}
//				break;

//		default:System.out.println("<-------------------------------------SORT BY ID---------------------------------------->");
//				for (Object object : TSE1) 
//				{
//					System.out.println(object);
//				} 
//				break;
		}
			
	}
}

class EmployeesIT implements Comparable
{
	int empid;
	String empname;
	int empsal;
	String emploc;
	String empdesg;
	
	public EmployeesIT(int empid, String empname, int empsal, String emploc, String empdesg) 
	{
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsal = empsal;
		this.emploc = emploc;
		this.empdesg = empdesg;
	}

	@Override
	public String toString() 
	{
		return "EmployeeIT [empid=" + empid + ", empname=" + empname + ", empsal=" + empsal + ", emploc=" + emploc
				+ ", empdesg=" + empdesg + "]";
	}

	@Override
	public int compareTo(Object obj) 
	{
		EmployeesIT eit = (EmployeesIT)obj;
		return this.empid - eit.empid;
	}	
}

class StudentsIT implements Comparable
{
	int studid;
	String studname;
	double studper;
	String studloc;
	
	public StudentsIT(int studid, String studname, double studper, String studloc) 
	{
		super();
		this.studid = studid;
		this.studname = studname;
		this.studper = studper;
		this.studloc = studloc;
	}

	@Override
	public String toString() 
	{
		return "StudentsIT [studid=" + studid + ", studname=" + studname + ", studper=" + studper + ", studloc="
				+ studloc + "]";
	}

	@Override
	public int compareTo(Object obj) 
	{
		StudentsIT sit = (StudentsIT)obj;
		return this.studid - sit.studid;
	}
		
}

class AscNAME implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		String n1,n2 = null;
		if (obj1 instanceof EmployeesIT && obj2 instanceof EmployeesIT)
		{
			EmployeesIT e1 =(EmployeesIT)obj1;
			EmployeesIT e2 =(EmployeesIT)obj2;
			n1 = e1.empname;
			n2 = e2.empname;
		}
		else if(obj1 instanceof StudentsIT && obj2 instanceof StudentsIT)
		{
			StudentsIT s1 = (StudentsIT)obj1;
			StudentsIT s2 = (StudentsIT)obj2;
			n1 = s1.studname;
			n2 = s2.studname;
		}
		else if(obj1 instanceof StudentsIT && obj2 instanceof EmployeesIT)
		{
			StudentsIT s1 = (StudentsIT)obj1;
			EmployeesIT e1 = (EmployeesIT)obj2;
			n1 = s1.studname;
			n2 = e1.empname;
			
		}
		else
		{
			EmployeesIT e2 = (EmployeesIT)obj1;
			StudentsIT s2 = (StudentsIT)obj2;
			n1 = e2.empname;
			n2 = s2.studname;
		}
		
		int disp  = n1.compareTo(n2);
		if(disp < 0)
			return disp;
		else
			return 1;
	}

	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	