package collectionsConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CollectionListConcept6 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		
		while(true)
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Student ID:"); int id = sc.nextInt();
		System.out.println("Enter the Stduent Name:"); String name = sc.next();
		System.out.println("Enter the Student Percentage:"); double percentage = sc.nextDouble();
		System.out.println("Enter the Student Branch:"); String branch = sc.next();
		
		Student s = new Student(id, name, percentage, branch);
		al.add(s);
		
		System.out.println("Do you want insert anthoer Record:(Yes/No)"); String res = sc.next();
		
		if (res.equalsIgnoreCase("no"))
		break;
		}
		
		System.out.println("<----------------------------Student Info--------------------------->");
		for (Object object : al) 
		{
			System.out.println(object);
		}
		System.out.println("<--------------------High Percentage Student Info------------------->");
		Student s = getHighper(al);
		System.out.println(al);
	}

	private static Student getHighper(ArrayList al) 
	{
		Student hs = null;
		double highper = 0.0;
		
		
		Iterator it = al.iterator();
		
		while (it.hasNext()) 
		{
			Object obj = it.next();
			
			if(obj instanceof Student)
			{
				Student s1 = (Student)obj;
				if(highper<s1.percentage)
				{
					highper = s1.percentage;
					hs = s1;
				}
			}
			
		}
		
		return hs;
	}
}

class Student
{
	int id;	
	String name;
	double percentage;
	String branch;
	
	public Student(int id, String name, double percentage, String branch) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
		this.branch = branch;
	}

	@Override
	public String toString() 
	{
		return "Student [id=" + id + ", name=" + name + ", percentage=" + percentage + ", branch=" + branch + "]";
	}
}
