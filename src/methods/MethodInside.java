package methods;
//Write a java program to read student information and based on that calculate percentage and display result.

import java.util.Scanner;
class MethodInside
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Student Name:");
		String name = sc.next();
		System.out.println("Enter the Student ID:");
		int id = sc.nextInt();
		System.out.println("Enter the Student Mark1:");
		int m1 =sc.nextInt();
		System.out.println("Enter the Student Mark2:");
		int m2 =sc.nextInt();
		System.out.println("Enter the Student Mark3:");
		int m3 =sc.nextInt();
		System.out.println("Enter the Student Mark4:");
		int m4 =sc.nextInt();
		
		displayinfo(name,id,m1,m2,m3,m4);
	}
	
	static void displayinfo(String name, int id, int m1, int m2, int m3, int m4)
	{
		System.out.println("Student Name:" +name);
		System.out.println("Student ID:" +id);
		System.out.println("Student Marks:" +m1 +" " +m2 +" " +m3 +" " +m4);
		System.out.println("Student Percentage:" +getper(m1,m2,m3,m4));
		System.out.println("Student Result:" +getresult(m1,m2,m3,m4));
	}
	
	static double getper(int m1,int m2, int m3, int m4)
	{
		return (m1+m2+m3+m4 / 4);
	}
	
	static String getresult(int m1, int m2, int m3, int m4)
	{
		if ( m1>=50 && m2>=50 && m3>=50 && m4>=50)
			return "Pass";
		else
			return "Fail";
	}
}