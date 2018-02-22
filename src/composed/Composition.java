package composed;

import java.util.*;
class  Composition
{
	public static void main(String[] args) 
	{
			PersonInfo p1 = new PersonInfo("Sara","Male");
			p1.display();
	}
}

class PersonInfo
{
	String pername, gender;
	Date dob;
	
	PersonInfo( String pername, String gender)
	{
		this.pername = pername;
		this.gender = gender;
		dob = new Date();
	}

	void display()
	{
		System.out.println("Name:" +pername);
		System.out.println("Gener:" +gender);
		dob.display();
	}
}

class Date
{
	int dd, mm, yy;

	Date()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Date, Month & Year(DD MM YY):");
		dd = sc.nextInt();
		mm = sc.nextInt();
		yy = sc.nextInt();
	}

	void display()
	{
		System.out.println("Date Of Birth:" +dd +"/" +mm +"/" +yy);
	}
}
