package OtherJavaConcepts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class InputPOutputStreamClass {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fin1 = new FileInputStream("D://InputFile1.txt");
		FileInputStream fin2 = new FileInputStream("D://InputFile2.txt");
		
		FileOutputStream fout = new FileOutputStream("D://OutputFile.txt");
		int read = 0;
				
		//Read from File and Display at Console and Writing in Different File
		
		while((read = fin1.read())!= -1) //Reading from File 
		{
			fout.write((byte)read);  //Writing at Different File 
			System.out.print((char)read); //Writing at Console
		}
		System.out.println("Thank You!");
		
			
		//Read from 2 Different File and Writing at Console and Writing in one File.
		
		SequenceInputStream sqin = new SequenceInputStream(fin1, fin2);
		
		while((read = sqin.read())!=-1)
		{
			System.out.print((char)read);
			fout.write((byte)read);
		}
		System.out.println("Thank You!");
		
		fin1.close();
		fin2.close();
		fout.close();
	
	}

}
