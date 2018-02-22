package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandle5 // FileNotFound Exception 
{

	public static void main(String[] args) throws FileNotFoundException 
	{
		System.out.println("Main Method Started");
		
//		FileInputStream fr = new FileInputStream("D:\\abc.txt");
		
		FileInputStream fr = new FileInputStream("D:/abc1.txt");
		
		
		System.out.println("Main Method Ended");

	}
}