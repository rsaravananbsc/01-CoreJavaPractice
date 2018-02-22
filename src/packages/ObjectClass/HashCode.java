package packages.ObjectClass;

public class HashCode 
{
	public static void main(String[] args) 
	{
	Object obj = new Object();
	Object obj1 = new Object();
	System.out.println(obj); //Return fully qualified name & address of OBJ
	System.out.println(obj1);// Return Fully qualified name & address of OBJ1
	
	System.out.println("---------------------------------------");
	
	System.out.println(obj.hashCode()); //Return unique integer values assigned by JVM. // Return the address of OBJ in form of Integer type.
	System.out.println(obj1.hashCode()); //Return unique integer values assigned by JVM. // Return the address of OBJ1 in form of Integer type.
	
	System.out.println("-----------------------------------------");
	
	System.out.printf("%x\n",obj.hashCode()); // Converting Unique value of OBJ Class to hexadecimal value.
	System.out.printf("%x\n",obj1.hashCode()); // Converting Unique value of OBJ1 Class to hexadecimal value.
	
	System.out.println("-----------------------------------------");
	
	Test1 t1 = new Test1();
	System.out.println(t1); //Return fully qualified name & address of Test1 Class.
	System.out.printf("%x\n",t1.hashCode()); // Return unique address  of Test1 class object in form of integer value and converting again to hexa-decimal value
	System.out.println(t1.hashCode()); //Returns overridden hashCode methods values.
	
	System.out.println("-----------------------------------------");
	
	Demo1 d1 = new Demo1(10);
	Demo1 d2 = new Demo1(20);
	
	System.out.println(d1.hashCode()); //Returns overridden methods of Demo1 class.
	System.out.println(d2.hashCode()); //Returns overridden methods of Demo1 class.
	}

}

class Demo1
{
	int id;
	
	public Demo1(int id) 
	{
		super();
		this.id = id;
	}

	public int hashCode()
	{
		return id;
	}
	
}

class Test1
{
	public int hashCode()
	{
		return 1000;
	}
}
