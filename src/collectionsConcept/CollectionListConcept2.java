package collectionsConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CollectionListConcept2 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
		
		System.out.println("Enter the Employee ID:"); int id = sc.nextInt();
		System.out.println("Enter the Employee Name:"); String name = sc.next();
		System.out.println("Enter the Employee Salary:"); double salary = sc.nextDouble();
		System.out.println("Enter the Employee Branch:"); String branch = sc.next();
		
		Employee E = new Employee(id, name, salary, branch);
		al.add(E);
		
		System.out.println("Do you want insert anthoer Record:(Yes/No)"); String res = sc.next();
		
		if (res.equalsIgnoreCase("no"))
		break;
		}
		
		System.out.println("<----------------------------Employee Info--------------------------->");
		for (Object object : al) 
		{
			System.out.println(object);
		}
	
		Employee e = getHighsal(al);
		System.out.println("<--------------------High Salary Employee Info------------------->");
		System.out.println(e);
		
		
	}

	private static Employee getHighsal(ArrayList al) 
	{
		Employee hs = null;
		double highsal = 0;
		Iterator it = al.iterator();
		while (it.hasNext()) 
		{
			Object obj = it.next();
			if(obj instanceof Employee)
			{
				Employee e1 = (Employee)obj;
				if(highsal < e1.salary)
				{
					hs = e1;
					highsal = e1.salary;
				}
			}
		}
		return hs;
	}
}

class Employee
{
	int id;	
	String name;
	double salary;
	String branch;
	public Employee(int id, String name, double salary, String branch) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", branch=" + branch + "]";
	}
	
	
}
