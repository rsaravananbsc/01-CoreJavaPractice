package collectionsConcept;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class CollectionLinkedListConcept2 
{
	public static void main(String[] args) 
	{
		LinkedList LL = new LinkedList();
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Please Choose Performance Methods"); 
			System.out.println("---------------------------------"); 
			System.out.println("Enter 1 For Add Records on Beginning of LinkedList:");
			System.out.println("Enter 2 For Add Records on End of LinkedList:"); 
			System.out.println("Enter 3 For Fetch First Recods From LinkedList:"); 
			System.out.println("Enter 4 For Fetch Last Records From LinkedList"); 
			System.out.println("Enter 5 For Remove First Records from LinkedList:");
			System.out.println("Enter 6 For Remove Last Records from LinkedList:");
			System.out.println("Enter 7 For Display All the Records:");
			System.out.println("Enter 8 For Modify Records:");
			System.out.println("<-------------------------------------------------------------->");
			int op = sc.nextInt();
		
			switch (op) 
			{
				case 1: BookShop bk = readbook();
						LL.addFirst(bk);
						System.out.println("Records Successfully Added in LinkedList at First Position");
						System.out.println("<-------------------------------------------------------------->");
						break;
				case 2: LL.addLast(readbook());
						System.out.println("Records Successfully Added in LinkedList at Last Position");
						System.out.println("<-------------------------------------------------------------->");
						break;
					
				case 3: System.out.println("Enter the Records Position:"); int idx = sc.nextInt();
						System.out.println("Records Successfully Fetched from LinkedList at "+idx +"Position");
						LL.get(idx);
						System.out.println("<-------------------------------------------------------------->");
						break;
						
				case 4: System.out.println("Enter the Records Position:"); int idx1 = sc.nextInt();
						System.out.println("Records Successfully Fetched from LinkedList at "+idx1 +"Position");
						LL.get(idx1);
						System.out.println("<-------------------------------------------------------------->");
						break;
					
				case 5: LL.removeFirst();
						System.out.println("Records Removed Successfully From First Position");
						System.out.println("<-------------------------------------------------------------->");
						break;
					
				case 6: LL.removeLast();
						System.out.println("Records Removed Successfully From Last Position");
						System.out.println("<-------------------------------------------------------------->");
						break;
					
				case 7: System.out.println("<------------------------BOOK INFO----------------------------->");
						for (Object object : LL) 
						{
							System.out.println(object);
						}
				
				case 8: System.out.println("Enter the Book Details Which is needs to Modify"); String bname=sc.nextLine();
						ListIterator LI = LL.listIterator();
						bk = null;
						while (LI.hasNext()) 
						{
							Object obj = (BookShop) LI.next();
							bk=(BookShop)obj;
							if (bk.bookname.equalsIgnoreCase(bk.bookname)) 
								break;
						}
						System.out.println("Enter the New Price:"); double newbookprice = sc.nextInt();
						bk.bookprice = newbookprice;
						System.out.println("Enter the New Arthor:"); String newbookname = sc.next();
						bk.bookarthor = newbookname;
						System.out.println("Records Updated Successfully");
						
				default:break;
						
			
			}

		}
		
//		System.out.println("Do You Want To Continue:(Yes/No):"); String ch = sc.nextLine();
//		if(ch.equalsIgnoreCase("no"))
//			break;
		
	}

	
	private static BookShop readbook() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Book Name:"); String bookname = sc.next();
		System.out.println("Enter Book Arthor"); String bookarthor = sc.next();
		System.out.println("Enter Book Price"); double bookprice = sc.nextDouble();

		return new BookShop(bookname, bookarthor, bookprice) ;
	}
}
		


class BookShop
{
	String bookname;
	String bookarthor;
	double bookprice;
	
	public BookShop(String bookname, String bookarthor, double bookprice) 
	{
		super();
		this.bookname = bookname;
		this.bookarthor = bookarthor;
		this.bookprice = bookprice;
	}

	@Override
	public String toString() {
		return "BookStore [bookname=" + bookname + ", bookarthor=" + bookarthor + ", bookprice=" + bookprice + "]";
	}

}
