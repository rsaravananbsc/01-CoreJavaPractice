package iopackage.StreamClasses.SerializationConcept;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeSerializationConcept
{
	public static void main(String[] args) throws Exception
	{
	
		FileInputStream fin = new FileInputStream("D:\\wo.txt");
		
		ObjectInputStream objin = new ObjectInputStream(fin);
		
//		Object obj = objin.readObject();
		
		Employee emp = (Employee)objin.readObject();
		
		System.out.println(emp.name);
		System.out.println(emp.id); // Its prints ID is Zero. because ID Object cant be De-Serialization 
		System.out.println(emp.company);
		System.out.println(emp.city);
		System.out.println(emp.salary); //Its Prints Salary is Zero. because we make Salary Field as Transient
		
		
		System.out.println("Object Fetched From External File Successfully");
		
		

	}
}


