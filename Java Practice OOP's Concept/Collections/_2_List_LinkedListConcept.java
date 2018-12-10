package Collections;

import java.util.LinkedList;
import java.util.Scanner;

public class _2_List_LinkedListConcept 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		LinkedList LL = new LinkedList();
		
		while(true)
		{
			System.out.println("Enter the Woker ID:"); int id = sc.nextInt();
			System.out.println("Enter the Worker Name:"); String name = sc.next();
			System.out.println("Enter the Worker Salary:"); double salary = sc.nextDouble();
		
			ITWorker ITW = new ITWorker(id, name, salary);
		
			LL.add(ITW);
		
			System.out.println("Do you Have More Records(Yes/No):"); String res = sc.next();
		
			if(res.equalsIgnoreCase("no"))
				break;
		}
		
		
		System.out.println("<------------------ITWorker Info------------------->");
		System.out.println("LinkedList Size:"+LL.size());
		for (Object obj : LL) 
		{
			System.out.println(LL);
		}
		
		System.out.println(LL.removeFirst()); //Removing the First Records from LinkedList
		System.out.println(LL.size()); //Post Removed LinkedList Size is 1.
		System.out.println(LL.removeLast()); //Removing the Last Records from LinkedList
		System.out.println(LL.size()); //Post Removed LinkedList Size is 0.
	}

}

class ITWorker
{
	int id;
	String name;
	double salary;
	public ITWorker(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "ITWorker [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
