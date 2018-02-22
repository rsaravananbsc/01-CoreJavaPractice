package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling9 // 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Method Started");
		
		try {
			FileInputStream fin = new FileInputStream("D:\\folder\\t1.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Main Method Ended");
			                        
	}
}
