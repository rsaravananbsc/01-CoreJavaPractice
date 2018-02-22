package iopackage.StreamClasses.SerializationConcept;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationConcept
{
	public static void main(String[] args) throws Exception
	{
	
		FileOutputStream fout = new FileOutputStream("D:\\wo.txt");
		
		ObjectOutputStream objout = new ObjectOutputStream(fout);
		
		Employee emp = new Employee("Wipro", "Saravanan", 15000, "Bangalore");
		
		Employee.id = 10077155;
		
		objout.writeObject(emp);
		
		System.out.println("Object Written on External File Successfully");

	}
}


