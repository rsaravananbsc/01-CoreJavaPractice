package iopackage.StreamClasses;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadSourceCodeFindCountOfLines //Write a Java Program to SourceCode and find Count of Lines
{
	public static void main(String[] args)
	{
		
		FileInputStream fin = null;
		try
		{
			fin = new FileInputStream("D:\\Oxygen\\java\\JAVAPractice\\src\\iopackage\\StreamClasses\\ReadSourceCodeFindCountOfChar.java");
			
			int i; int count = 0;
			while ((i = fin.read()) != -1)
			{
				if(i=='\n')
					count++;
			}
			System.out.println("Count of Line in CourceCode:"+count);
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