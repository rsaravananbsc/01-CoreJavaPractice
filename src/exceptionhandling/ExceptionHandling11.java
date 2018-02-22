package exceptionhandling;

import java.io.IOException;
import java.sql.SQLException;

public class ExceptionHandling11 //  Exception Propagation 
{
	public static void main(String[] args) throws IOException, SQLException //Exception. Parent Type exception propagate all the Exception
	{
		System.out.println("Main Method Started");
		
		Sample s1 = new Sample();
		
		try 
		{
			s1.check(0);
		} 
		catch (IOException | SQLException e) // Directly can use Exception e
		{
			e.printStackTrace();
		}
				
		System.out.println("Main Method Ended");
			                        
	}
}

class Sample
{
	void check(int a) throws IOException, SQLException // Can use Separate Exception or Direct use SuperMost Class Exception. 
	{
		System.out.println("Sub-Class Started");
		
		if(a==0)
			throw new ArithmeticException("Zero"); //Unchecked Exception Not Required Propagation. Because all the Runtime Exception Implicit
		
		if(a%2==0)
			throw new IOException("EVEN"); //Checked Exception Required Propagation. 
		if(a%2!=0)
			throw new SQLException("ODD"); //Checked Exception Required Propagation.
		
		System.out.println("Sub-Class Ended");
		
	}
}
