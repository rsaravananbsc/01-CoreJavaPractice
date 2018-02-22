package composed;

import java.util.*;
class  Composition2
{
	public static void main(String[] args) 
	{
		Stream mech = new Stream ("Data","CAD","Hydralics","MotorEnigne");
		Stream ece = new Stream ("Diodate","Mathss","Circuits","Lights");
		Stream cse = new Stream ("Java","Kava","Mava","Kova");

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Student Records:");
		int n = sc.nextInt();

		Student std[] = new Student[n];
		
		for (int i=0;i<n;i++)
		{
			System.out.print("Enter the " +(i+1) +" Student Record");
			System.out.print("Enter the Student Name:");
			String name = sc.next();
			System.out.print("Enter the Student ID:");
			int id = sc.nextInt();
			System.out.print("Enter the the Stream ID For 1.Mech 2.ECE 3.CSE :");
			Stream str = null;
			int ch = sc.nextInt();
			if (ch==1)
			str = mech;
			else if(ch ==2)
			str = ece;
			else if(ch==3)
			str = cse;

			System.out.print("Enter Percentage:");
			double per = sc.nextDouble();

			std[i] = new Student(name,str,id,per);
		}

		System.out.println("<-------------Student Information--------------->");
		for (int i=0;i<std.length;i++)
		{
			std[i].display();
			System.out.println("---------------------------------------------");
		}
	}
}

class Stream
{
	String name, s1,s2,s3,s4;

	Stream(String s1, String s2, String s3, String s4)
	{
		this.name = name;
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		this.s4 = s4;
	}

	String getinfo()
	{
		return ""+"Stream: " +"[" +s1 +" | " +s2 +" | " +s3 +" | " +s4 +"]" ; 
	}
}

class Student
{
	String name;
	Stream str;
	int id;
	double per;

	Student ( String name, Stream str, int id, double per)
	{
		this.name = name;
		this.str = str;
		this.id = id;
		this.per = per;
	}

	void display()
	{
		System.out.println("Student Name:" +name);
		System.out.println("Student ID:" +id);
		System.out.println("Student Percentage:"+per);
		System.out.println(str.getinfo());
	}

}