package constructor;

import java.util.Scanner;

class Constructor8
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Count of Books Records:"); 
		int irec = scan.nextInt();
		int i=1; 
		BookInfo1 bk = null;
		
		while (i <= irec)
		{
			
			
			System.out.println("Enter the Book Name:"); String name = scan.next();
			System.out.println("Enter the Book Publisher:"); String pub = scan.next();
			System.out.println("Enter the Book Arthur:"); String auth = scan.next();
			System.out.println("Enter the Book ID:"); int id = scan.nextInt();
			System.out.println("Enter the Book ISBN:"); int isbn = scan.nextInt();
			System.out.println("Enter the Book Price:"); double price = scan.nextDouble();
		
			bk = new BookInfo1(name, pub, auth, id, isbn, price);
		
			i++;
		}
		bk.BkInfo();
		

//		System.out.println("Do you want to Display the Inventories: Yes/No?"); String di = scan.next();
//		if (di=="Yes")
//			bk.BkInfo();
		
			
		
	}
}

class BookInfo1
{
	String bkname;
	String bkpub;
	String bkauth;
	int bkid;
	int bkisbn;
	double bkprice;

	public BookInfo1(String bkname, String bkpub, String bkauth, int bkid, int bkisbn, double bkprice) 
	{
		super();
		this.bkname = bkname;
		this.bkpub = bkpub;
		this.bkauth = bkauth;
		this.bkid = bkid;
		this.bkisbn = bkisbn;
		this.bkprice = bkprice;
	}


	void BkInfo()
	{
		System.out.println("BOOK INVENTORY");
		System.out.println("---------------");
		System.out.println("Book Name: " +bkname);
		System.out.println("Book Auther: " +bkauth);
		System.out.println("Book Publisher: " +bkpub);
		System.out.println("Book ID: " +bkid);
		System.out.println("Book ISBN Number: " +bkisbn);
		System.out.println("Book Price: " +bkprice);
		System.out.println("____________________________");
	}

} 


