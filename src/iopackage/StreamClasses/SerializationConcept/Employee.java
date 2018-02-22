package iopackage.StreamClasses.SerializationConcept;

import java.io.Serializable;

public class Employee implements Serializable
{

	static int id;
	String company;
	String name;
	transient double salary;
	String city;
	
	public Employee(String company, String name, double salary, String city) 
	{
		super();
		this.company = company;
		this.name = name;
		this.salary = salary;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [company=" + company + ", name=" + name + ", salary=" + salary + ", city=" + city + "]";
	}

}
