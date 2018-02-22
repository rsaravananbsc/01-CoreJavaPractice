package iopackage.StreamClasses;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadSourceCodeCopyToAnother 
{
	public static void main(String[] args) throws Exception
	{
		FileInputStream fin = null;
		FileOutputStream fout = null;
		
		fin = new FileInputStream("D:\\Oxygen\\java\\JAVAPractice\\src\\iopackage\\StreamClasses\\ReadSourceCodeCopyToAnother.java");
		fout = new FileOutputStream("D:\\CopiedFile.txt");
		
		int i;
		
		while((i = fin.read()) != -1)
		{
			fout.write((byte)i);
			System.out.print((char)i); //To see How Copying is Happening Char By Char
			Thread.sleep(500); //To Makes Printing process delay.
		}
		fout.flush();
				
		System.out.println("Data Read & Copied to Another File Successfully");
		
		fin.close();
		fout.close();
		
		
	}
}