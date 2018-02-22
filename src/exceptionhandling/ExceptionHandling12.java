package exceptionhandling;

import java.io.FileInputStream;
import java.sql.SQLException;

public class ExceptionHandling12 // 
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("Main Method Started");
		
		int a = 23;
		if(a>2)
			throw new ArithmeticException();  // Its will propagate to JVM because its Checked Exception 
		if(a<3)
			throw new SQLException(); // It wont propagate hence throw to JVM propagate to JVM 
		
		FileInputStream fin = new FileInputStream("D:\\test.txt"); //It wont propagate hence throw to JVM propagate to JVM
		
							
		System.out.println("Main Method Ended");
			                        
	}
}
