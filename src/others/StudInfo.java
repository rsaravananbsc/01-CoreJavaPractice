package others;
//Write a java program to read a student information and display it.

import java.util.Scanner;
class StudInfo
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student Name:");
		String name = sc.nextLine();
		
		System.out.println("Enter Student Stream:");
		String strm = sc.nextLine();
		
		System.out.println("Enter Student City:");
		String city = sc.nextLine();
		
		System.out.println("Enter Student Register Number:");
		int regno = sc.nextInt();		
							
		System.out.println("Enter Student Percentage:");
		double per = sc.nextDouble();
		
	
		System.out.println("STUDENT INFORMATION");
		System.out.println("********************");
		System.out.println("Student Name: " +name);
		System.out.println("Student Registration Number: " +regno);
		System.out.println("Student Education Stream: " +strm);
		System.out.println("Student Acadamic Percentage: " +per);
		System.out.println("Student Location:" +city);
		
	}
}
