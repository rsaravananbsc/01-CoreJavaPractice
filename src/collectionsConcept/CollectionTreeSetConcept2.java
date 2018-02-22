package collectionsConcept;

import java.util.Scanner;
import java.util.TreeSet;

public class CollectionTreeSetConcept2 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		TreeSet TS = new TreeSet();
		
		while(true)
		{	
			System.out.println("Enter 1 For Add Records Sorted By EMP ID:"); 
			System.out.println("Enter 2 For Add Records Sorted By EMP Name:"); 
			System.out.println("Enter 3 For Add Records Sorted By EMP Salary:"); 
			System.out.println("Enter 4 For Add Records Sorted By EMP Location:"); 
			System.out.println("Enter 5 For Display All the Records:");
			
			int ch = sc.nextInt();
		switch (ch) 
		{
			case 1: ITEmployee ITE = readData();
					TS.add(ITE);
					System.out.println("Records Saved");
					break;
					
			case 2: ITEmployee ITE1 = readData();
					TS.add(ITE1);
					System.out.println("Records Saved");
					
					break;
					
			case 3: ITEmployee ITE2 = readData();
					TS.add(ITE2);
					System.out.println("Records Saved");
					
					break;
			
			case 4: ITEmployee ITE3 = readData();
					TS.add(ITE3);
					System.out.println("Records Saved");
					
					break;
			
			case 5: System.out.println("<---------------------------EMPLOYEE INFO------------------------------->");
					for (Object object : TS)
					{
						System.out.println(object);
					}
					System.out.println("<---------------------------EMPLOYEE INFO------------------------------->");
					break;
		
			default: 
					break;
			
		}
		}
	}

	
	static ITEmployee readData() 
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee ID:"); int EMPId = sc.nextInt();
		System.out.println("Enter Employee Name:"); String EMPName=  sc.next();
		System.out.println("Enter Employee Salary:"); double EMPSalary = sc.nextDouble();
		System.out.println("Enter Employee Location:"); String EMPSite = sc.next();
		
		return new ITEmployee(EMPId, EMPName, EMPSalary, EMPSite);	
	}

}

class ITEmployee implements Comparable
{
	int EMPId;
	String EMPName;
	double EMPSalary;
	String EMPSite;
	
	public ITEmployee(int eMPId, String eMPName, double eMPSalary, String eMPSite) 
	{
		super();
		EMPId = eMPId;
		EMPName = eMPName;
		EMPSalary = eMPSalary;
		EMPSite = eMPSite;
	}

	@Override
	public String toString() 
	{
		return "ITEmployee [EMPId=" + EMPId + ", EMPName=" + EMPName + ", EMPSalary=" + EMPSalary + ", EMPSite="
				+ EMPSite + "]";
	}
	
//	@Override
//	public int compareTo(Object obj) 
//	{
//		ITEmployee ite = (ITEmployee)obj;
//		return this.EMPId - ite.EMPId;
//	}
	
	public int compareTo(Object obj) 
	{
		ITEmployee ite = (ITEmployee)obj;
		if(this.EMPSalary < ite.EMPSalary)
			return -1;
		else if(this.EMPSalary > ite.EMPSalary)
			return 1;
		else 
			return 0;
	}

}

//public int compareTo1(Object obj) 
//{
//	ITEmployee ite = (ITEmployee)obj;
//	return this.EMPId - ite.EMPId;
//}
//
//public int compareTo2(Object obj) 
//{
//	ITEmployee ite = (ITEmployee)obj;
//	return this.EMPName.compareTo(ite.EMPName);
//}
//
//public int compareTo3(Object obj) 
//{
//	ITEmployee ite = (ITEmployee)obj;
//	if(this.EMPSalary < ite.EMPSalary)
//		return -1;
//	else if(this.EMPSalary > ite.EMPSalary)
//		return 1;
//	else 
//		return 0;
//}
//
//public int compareTo4(Object obj) 
//{
//	ITEmployee ite = (ITEmployee)obj;
//	return this.EMPSite.compareTo(ite.EMPSite);
//}
