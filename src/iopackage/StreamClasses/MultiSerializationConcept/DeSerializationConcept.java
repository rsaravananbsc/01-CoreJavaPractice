package iopackage.StreamClasses.MultiSerializationConcept;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class DeSerializationConcept
{
	public static void main(String[] args) throws Exception
	{
	
		FileInputStream fin = new FileInputStream("D:\\wo1.txt");
		
		ObjectInputStream objin = new ObjectInputStream(fin);
		
		Object obj = objin.readObject();
		
		List l = (List)obj;
		
		if(obj instanceof List)
		{
			
			for(Object obj1 : l)
			{
				System.out.println(obj1);
			}
		}
		
		System.out.println("Multiple Object Fetched From External File Successfully");
	
	}
}


