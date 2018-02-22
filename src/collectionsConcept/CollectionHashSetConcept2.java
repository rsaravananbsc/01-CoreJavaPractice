package collectionsConcept;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class CollectionHashSetConcept2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		HashSet hs = new HashSet();
		while(true)
		{
			System.out.println("Enter 1 for Add a Record");
			System.out.println("Enter 2 Display Records");
			int ch = sc.nextInt();
			
			switch (ch) 
			{
			case 1: Book b = readbook();
					hs.add(b);
					System.out.println("Records Saved");
					break;
					
			case 2: System.out.println("<-----------------BOOKINFO--------------------->");
					for (Object object : hs) 
					{
						System.out.println(object);
					}
					break;
			default:
				break;
			}
			
	}
	
}


private static Book readbook() 
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Book Name:"); String bName = sc.next();
	System.out.println("Enter the Book Arthur"); String aName = sc.next();
	System.out.println("Enter the Book Price:"); int bPrice = sc.nextInt();
		return new Book(bName, aName, bPrice);
}

}

class Book
{
	String bName;
	String aName;
	int bPrice;
	public Book(String bName, String aName, int bPrice) 
	{
		super();
		this.bName = bName;
		this.aName = aName;
		this.bPrice = bPrice;
	}
	
	@Override
	public String toString()
	{
		return "Book [bName=" + bName + ", aName=" + aName + ", bPrice=" + bPrice + "]";
	}
	
	public int hashCode()
	{
		return bPrice;	
	}
	
	public boolean equals(Object obj)
	{
		return this.hashCode() == obj.hashCode();
	}

}
