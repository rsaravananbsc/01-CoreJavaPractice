package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling10 //  Exception Propagation 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		System.out.println("Main Method Started");
		
		FileOpen fo = new FileOpen();
		try {
			fo.open("d:\\test.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //Can Throw exception to JVM or Can Handle exception by Try..Catch Block.
				
		System.out.println("Main Method Ended");
			                        
	}
}

class FileOpen
{
	void open(String path) throws FileNotFoundException // Throw keyword used to do Propagation. Passing exception from SubClass to MainClass
	{
	System.out.println("Sub-Class Method Started");
	
	FileInputStream fin = new FileInputStream(path);
	
	System.out.println("Sub-Class Method Ended");
	}
}
