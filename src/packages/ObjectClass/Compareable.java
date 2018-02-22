package packages.ObjectClass;

public class Compareable 
{
	public static void main(String[] args) 
	{
		Book2 bk1 = new Book2(10, "Java", 100.00);
		Book2 bk2 = new Book2(20, "KAVA", 200.87);
		
		System.out.println(bk1.compareTo(bk2));
		System.out.println(bk2.compareTo(bk1));
		
		MyComparable mc = new MyComparable();
		System.out.println(mc.compareTo(bk1));
		System.out.println(mc.compareTo(bk2));
	
	}
	
	
}

class Book2
{
	int id;
	String name;
	double price;
	public Book2(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public int compareTo(Object obj)
	{
		Book2 bk = (Book2)obj;
		return this.id - bk.id;
	}
}

@SuppressWarnings("rawtypes")
class MyComparable implements Comparable
{
	public int compareTo(Object obj)
	{
		return this.hashCode() - obj.hashCode();
	}
}
