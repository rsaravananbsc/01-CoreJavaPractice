package iopackage.StreamClasses.MultiSerializationConcept;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializationConcept
{
	public static void main(String[] args) throws Exception
	{
	
		FileOutputStream fout = new FileOutputStream("D:\\wo1.txt");
		
		ObjectOutputStream objout = new ObjectOutputStream(fout);
		
		Employee.ComCode = 102;
		
		Employee emp = new Employee("Wipro", "Saravanan", 15000, "Bangalore");
		Employee emp1 = new Employee("Wipro", "Ramesh", 18000, "Bangalore");
		Employee emp2 = new Employee("Wipro", "Suresh", 20000, "Bangalore");
		Employee emp3 = new Employee("Wipro", "Rakesh", 25000, "Bangalore");
		
		ArrayList al = new ArrayList();
		al.add(emp);
		al.add(emp1);
		al.add(emp2);
		al.add(emp3);
		
		objout.writeObject(al);		
			
		System.out.println("Multiple Object Written on External File Successfully");

	}
}


