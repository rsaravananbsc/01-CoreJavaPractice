package iopackage.StreamClasses;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class ReadSourceCodeFromMultipleFilesToWriteSingleFile2 //
{
	public static void main(String[] args) throws Exception
	{
		FileInputStream fin = new FileInputStream("D:\\Oxygen\\java\\JAVAPractice\\src\\iopackage\\StreamClasses\\ReadSourceCodeCopyToAnother.java");
		FileInputStream fin1 = new FileInputStream("D:\\Oxygen\\java\\JAVAPractice\\src\\iopackage\\StreamClasses\\ReadSourceCodeDisplayOnConsole.java");
		
		FileOutputStream fout = new FileOutputStream("D:\\CopiedFile2.txt");
		
		SequenceInputStream sqin = new SequenceInputStream(fin, fin1);
		
		int i;
		
		while((i=sqin.read())!= -1)
		{
			System.out.print((char)i);
			fout.write((char)i);
		}
		
		
	
		System.out.println("Data Read from 2 Different Successfully");
	
		sqin.close();sqin.close(); fin1.close();fin.close();fout.close();
		
	}
}