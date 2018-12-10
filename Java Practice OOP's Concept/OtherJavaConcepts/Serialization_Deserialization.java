package OtherJavaConcepts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization_Deserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		//Serialization Concept
		FileOutputStream fout = new FileOutputStream("D://Serial.txt");
		ObjectOutputStream objout = new ObjectOutputStream(fout);
		
		EmployeePortal emp = new EmployeePortal("Saravanan", 100, "BLR", 20000);
		objout.writeObject(emp);
		
		System.out.println("Object has been Written Successfully on ExternalFile");
		
		
		
		//DeSerialization Concept
		FileInputStream fin = new FileInputStream("D://DeSerial.txt");
		ObjectInputStream objin = new ObjectInputStream(fin);
		
		emp = (EmployeePortal) objin.readObject();
		
		System.out.println(emp.empname);
		System.out.println(emp.empid);
		System.out.println(emp.emplocation);
		System.out.println(emp.empsalary);
		
		System.out.println("Objects has been read successfully from ExternalFile");
	}

}


class EmployeePortal implements Serializable
{
	String empname;
	int empid;
	String emplocation;
	int empsalary;

	public EmployeePortal(String empname, int empid, String emplocation, int empsalary) {
		super();
		this.empname = empname;
		this.empid = empid;
		this.emplocation = emplocation;
		this.empsalary = empsalary;
	}
	
}
