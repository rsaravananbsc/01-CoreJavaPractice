package collectionsConcept;

import java.util.Iterator;
import java.util.TreeSet;

public class CollectionTreeSetConcept1 
{
	public static void main(String[] args) 
	{
		TreeSet ts = new TreeSet();
		StudentInfo std1 = new StudentInfo(100, "Saravanan",78.89);
		StudentInfo std2 = new StudentInfo(300, "Santhosh",90.89);
		StudentInfo std3 = new StudentInfo(400, "Subramaniyam",50.89);
		StudentInfo std4 = new StudentInfo(100, "Sundaram",90.89);
		StudentInfo std5 = new StudentInfo(200, "Saravanan",100.00);
		
		ts.add(std1);
		ts.add(std2);
		ts.add(std3);
		ts.add(std4);
		
		Iterator it = ts.iterator();
		while (it.hasNext()) 
		{
			System.out.println(it.next());
		}
		System.out.println("----------------------------------------------");
		for (Object object : ts) 
		{
			System.out.println(object);
		}

	}
}

class StudentInfo implements Comparable
{
	int id;
	String name;
	double per;
	public StudentInfo(int id, String name, double per) 
	{
		super();
		this.id = id;
		this.name = name;
		this.per = per;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", per=" + per + "]";
	}
	
	//Adding Records by Comparing Student ID
	public int compareTo(Object obj) 
	{
		StudentInfo s = (StudentInfo)obj;
		return this.id - s.id;
	}
	
	//Adding Records by Comparing Student ID //Want to use Descending order use - Symbol on Return Statement.
//		public int compareTo(Object obj) 
//		{
//			StudentInfo s = (StudentInfo)obj;
//			return -this.id - s.id;
//		}
	
	//Adding Records by Comparing by Student percentage
//	public int compareTo(Object obj) 
//	{
//		StudentInfo s = (StudentInfo)obj;
//		if(this.per<s.per)
//			return -1;
//		else if(this.per>s.per) 
//			return 1;
//		else 
//			return 0;
//	}
	
	//Adding Records by Comparing Student Names
//	public int compareTo(Object obj) 
//	{
//		StudentInfo s = (StudentInfo)obj;
//		return this.name.compareTo(s.name);
//	}

	
}
