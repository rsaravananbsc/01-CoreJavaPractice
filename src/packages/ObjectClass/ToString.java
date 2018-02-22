package packages.ObjectClass;

public class ToString 
{
	public static void main(String[] args) 
	{
		Object obj = new Object();
		String s = obj.toString();
		System.out.println(s);
		//Its a non-static public, non-final method of object class. inside this method ,
		//they have written code to return the fully qualified name & address in the form String.
		
		System.out.println("---------------------------------------");
		
		Demo d1 = new Demo();
		String s1 = d1.toString();
		System.out.println(s1); // This methods calls the Fully Qualified of Demo Class Packages Name. Demo Class Name. Address of Demo Class.
		
		System.out.println("---------------------------------------");
		
		System.out.println(s); //Returns toString return value
		System.out.println(s1.toString());
		
		System.out.println("---------------------------------------");
		
		Test t1 = new Test();
		System.out.println(t1.toString()); //Returns overridden toString Method String.
		System.out.println(t1); //Returns overridden toString methods from Test Class
		
		System.out.println("---------------------------------------");
		
		Book bk = new Book(10, "JAVA", 145.60);
		System.out.println(bk);  //Return override methods values only. 
		System.out.println(bk.toString());
		
		System.out.println("---------------------------------------");
		
		Book1 bk1 = new Book1(10, "JAVA", 145.60);
		System.out.println(bk1); //Return overridden constructor return values. (Book ID, Book Name, Book Price)
		System.out.println(bk1.toString());
		
		
	}

}

class Demo
{
	
}

class Test
{
	public String toString() 
	{
		return "OverRidded ToString Method";
	}
	
}

class Book
{
	int id;
	String name;
	double price;
	public Book(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public String toString()
	{
		return "Book";
		
	}
}

class Book1
{
	int id;
	String name;
	double price;
	public Book1(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public String toString()
	{
		return "[Book1:"+id+" "+name+" "+price+"]";
		
	}
}
