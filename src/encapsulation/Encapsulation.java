package encapsulation;

public class Encapsulation {

	public static void main(String[] args) 
	{
		Book bk = new Book();
		bk.setID(123);
		bk.setName("JAVA");
		bk.setPrice(345);
		
		System.out.println("BOOK INFO");
		System.out.println("Book ID:"+bk.getID());
		System.out.println("Book Name: "+bk.getName());
		System.out.println("Book Price: "+bk.getPrice());
		
//		Book bk1 = new Book();
//		bk1.getID();
//		bk1.getName();
//		bk1.getPrice();
	}
}

class Book
{
	private int id;
	private String name;
	private double price;
	
	public void setID(int id) 
	{
		this.id = id;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public double getPrice() 
	{
		return price;
	}

	public String getName() 
	{
		
		return name;
	}
	
	public int getID() 		
	{
		
		return id;
	}

}
