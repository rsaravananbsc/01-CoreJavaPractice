package iopackage.StreamClasses.MultiSerializationConcept;

import java.io.Serializable;

public class Employee implements Serializable
{

	static int ComCode;
	String company;
	String name;
	transient double salary;
	String city;
	
	public Employee(String company, String name, double salary, String city) 
	{
		super();
		this.ComCode = ComCode;
		this.name = name;
		this.salary = salary;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [company=" + ComCode + ", name=" + name + ", salary=" + salary + ", city=" + city + "]";
	}

}
