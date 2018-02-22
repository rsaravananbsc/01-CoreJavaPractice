package collectionsConcept;

import java.util.LinkedList;
import java.util.Scanner;

public class CollectionLinkedListConcept1 
{
	public static void main(String[] args) 
	{
		LinkedList LL = new LinkedList();
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
				
			System.out.println("Please Choose Performance Methods"); 
			System.out.println("--------------------------------"); 
			System.out.println("Enter 1 For Add Records on Beginning of LinkedList:");
			System.out.println("Enter 2 For Add Records on End of LinkedList:"); 
			System.out.println("Enter 3 For Fetch First Recods From LinkedList:"); 
			System.out.println("Enter 4 For Fetch Last Records From LinkedList"); 
			System.out.println("Enter 5 For Remove First Records from LinkedList:");
			System.out.println("Enter 6 For Remove Last Records from LinkedList:");
			System.out.println("Enter 7 For Exit from Operation:");
			int op = sc.nextInt();
			
			System.out.println("Enter Book Name:"); String bookname = sc.next();
			System.out.println("Enter Book Arthor"); String bookarthor = sc.next();
			System.out.println("Enter Book Price"); double bookprice = sc.nextDouble();
			
			BookStore BK = new BookStore(bookname, bookarthor, bookprice);
//			LL.add(BK);
			
			System.out.println("Do You Have Record To Add(Yes/No)"); String res = sc.next();
			
			if(op == 1)
			{
				LL.addFirst(BK);
				System.out.println("Records Added Successfully at First Position of LInkedList");
			}
			else if (op == 2)
			{
				LL.addLast(BK);
				System.out.println("Records Added Successfully at Last Position of LInkedList");
			}
			else
				break;
				
			if(res.equalsIgnoreCase("no"))
					break;

		}
		
		System.out.println("<---------------BOOK INFO-------------->");
		for (Object obj : LL) 
		{
			System.out.println(obj);
		}
	}

}

class BookStore
{
	String bookname;
	String bookarthor;
	double bookprice;
	
	public BookStore(String bookname, String bookarthor, double bookprice) 
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
