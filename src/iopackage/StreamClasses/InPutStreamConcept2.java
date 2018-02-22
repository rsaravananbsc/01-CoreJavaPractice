package iopackage.StreamClasses;

import java.io.FileInputStream;
import java.io.IOException;

public class InPutStreamConcept2 //Reading Data to External Documents.
{
	public static void main(String[] args) throws IOException 
	{
		
			FileInputStream fin = new FileInputStream("D:\\test.txt");
			
			int rd = 0;
			
			while((rd=fin.read())!= -1)
			{
				System.out.print((char)rd);
			}
		System.out.println("\nThank You");
	
	}
}
