package iopackage.StreamClasses;

import java.io.FileInputStream;
import java.io.SequenceInputStream;

public class ReadSourceCodeFromMultipleFiles //Write a Java Program to SourceCode and find Count of Lines
{
	public static void main(String[] args) throws Exception
	{
		FileInputStream fin = new FileInputStream("D:\\Oxygen\\java\\JAVAPractice\\src\\iopackage\\StreamClasses\\ReadSourceCodeCopyToAnother.java");
		FileInputStream fin1 = new FileInputStream("D:\\Oxygen\\java\\JAVAPractice\\src\\iopackage\\StreamClasses\\ReadSourceCodeDisplayOnConsole.java");
		
		SequenceInputStream sqin = new SequenceInputStream(fin, fin1);
		
		int i;
		
		while((i=sqin.read())!= -1)
		{
			System.out.print((char)i);
		}
	
		System.out.println("Data Read from 2 Different Successfully");
	
		sqin.close();sqin.close();
		
	}
}