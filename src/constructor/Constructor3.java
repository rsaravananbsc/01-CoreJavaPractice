package constructor;

import java.util.Scanner;
class Constructor3
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the Count of Books Records:"); 
		int irec = scan.nextInt();
		int i=1; 
		BookInfo bk;
	
		while (i <= irec)
		{
		System.out.print("Enter the Book Name:"); String name = scan.next();
		System.out.print("Enter the Book Publisher:"); String pub = scan.next();
		System.out.print("Enter the Book Arthur:"); String auth = scan.next();
		System.out.print("Enter the Book ID:"); int id = scan.nextInt();
		System.out.print("Enter the Book ISBN:"); int isbn = scan.nextInt();
		System.out.print("Enter the Book Price:"); double price = scan.nextDouble();

		bk = new BookInfo(name,pub,auth,id,isbn,price);
		i++;
		}
		
		
//		System.out.println("Do you want to Display the Inventories: Yes/No?"); 
//		String di = scan.next();
//		if (di=="Yes")
//		{
			
//		}
		

//		bk.bkinfo();
		
//		BookInfo bk1 = new BookInfo(name,pub,auth,id,isbn,price);
//		bk1.BkInfo();
//		BookInfo bk2 = new BookInfo(name,pub,auth,id,isbn,price);
//		bk2.BkInfo();
	}
}

class BookInfo
{
	String bkname,bkpub,bkauth;
	int bkid, bkisbn;
	double bkprice;


	BookInfo (String bkname,String bkpub,String bkauth,int bkid, int bkisbn,double bkprice)
	{
		this.bkname = bkname; this.bkpub = bkpub;  this.bkauth =bkauth; this.bkid = bkid; this.bkisbn = bkisbn; this.bkprice = bkprice;
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

	
