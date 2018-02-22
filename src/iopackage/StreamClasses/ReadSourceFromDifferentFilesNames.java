package iopackage.StreamClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class ReadSourceFromDifferentFilesNames 
{
	public static void main(String[] args) throws Exception 
	{
		FileInputStream fin = null;
		FileOutputStream fout = new FileOutputStream("D:\\CopyAll.txt");
		File f = new File("D:\\Oxygen\\java\\JAVAPractice\\src\\others");
		Vector v = new Vector();
		
		File f1[] = f.listFiles();
		
		for (int i = 0; i < f1.length; i++) 
		{
			if(f1[i].getName().contains(".java"))
			{
				fin = new FileInputStream(f1[i]);
				v.add(fin);				
			}
		}
		
		
		Enumeration e = v.elements();
		
		SequenceInputStream sqin = new SequenceInputStream(e);
		
		int i;
		while((i=sqin.read()) != -1)
		{
			System.out.print((char)i);
			fout.write((byte)i);
		}
		

	}

}
