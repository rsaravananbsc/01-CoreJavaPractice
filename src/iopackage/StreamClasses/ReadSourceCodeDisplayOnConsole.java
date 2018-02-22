package iopackage.StreamClasses;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadSourceCodeDisplayOnConsole //Write a Java Program to SourceCode in the Console. 
{
	public static void main(String[] args)
	{
		
		FileInputStream fin = null;
		try
		{
			fin = new FileInputStream("D:\\Oxygen\\java\\JAVAPractice\\src\\iopackage\\StreamClasses\\ReadSourceCodeDisplayOnConsole.java");
		
			int i;
			while ((i = fin.read()) != -1)
			{
				System.out.print((char)i);
			}
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
		System.out.println("Data Read Successfully");
	}
}
