package iopackage.StreamClasses;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.FileVisitOption;

public class OutPutStreamConcept //Writing Data to External Documents.
{
	public static void main(String[] args) 
	{
		FileOutputStream fout = null;
		String st = "Hi How are you"; 
		
		
		try 
		{
			fout = new FileOutputStream("D:\\test.txt");
			
			try 
			{
				int a = 66; // It Writes the ASCII Code of 65: its Writing A on Text Document
				fout.write(a);
				
				byte b[] = st.getBytes(); //Converting String to Byte.
				fout.write(b); // Writing on Document but It wont do Overwrite on Document.
				
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			try 
			{
				fout.flush();
				fout.close();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
			System.out.println(st);
			System.out.println("Successfully Written");
		}
	
	}

}
