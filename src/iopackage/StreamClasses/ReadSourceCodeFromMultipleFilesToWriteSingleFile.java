package iopackage.StreamClasses;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class ReadSourceCodeFromMultipleFilesToWriteSingleFile //
{
	public static void main(String[] args) throws Exception
	{
		FileInputStream fin = null;
		FileOutputStream fout = new FileOutputStream("D:\\Copy.doc");
		
		Vector v = new Vector();
		
		for(int i =1; i<=20;i++)
		{
			String path = "D:\\Oxygen\\java\\JAVAPractice\\src\\mcqjava\\Test"+i+".java";
			fin = new FileInputStream(path);
			v.add(fin);
		}
		
		Enumeration e = v.elements();
		
		SequenceInputStream sqin = new SequenceInputStream(e);
		
		int i;
		while((i=sqin.read()) != -1)
		{
			System.out.print((char)i);
			fout.write((byte)i);
		}
		
		fin.close();fout.close(); v.clear();
	}
}