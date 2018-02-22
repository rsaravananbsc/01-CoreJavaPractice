package iopackage.StreamClasses;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadSourceCodeFindCountOfChar //Write a Java Program to SourceCode and find Count of Lines
{
	public static void main(String[] args)
	{
		
		FileInputStream fin = null;
		try
		{
			fin = new FileInputStream("D:\\Oxygen\\java\\JAVAPractice\\src\\iopackage\\StreamClasses\\ReadSourceCodeFindCountOfLines.java");
		
			int count = fin.available();
			System.out.println("Count of Chars in SourceCode:"+count);
			System.out.println(fin.getFD()); // Prints Fully Qualified Address of Program.
			System.out.println(fin.hashCode()); //Prints Program Address in Form of HashCode
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		finally 
		{
			try 
			{
				fin.close();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		System.out.println("Data Read & Lines of Code Counted Successfully");
	}
}