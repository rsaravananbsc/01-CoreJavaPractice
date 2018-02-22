package iopackage.StreamClasses;

import java.io.File;

public class FindDirectoryAllDetails //
{
	public static void main(String[] args) throws Exception
	{
		File f = new File("D:\\Oxygen\\java\\JAVAPractice\\src\\mcqjava");
		
		System.out.println(f.getName());
		System.out.println(f.getParent());
		System.out.println(f.getPath());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getParentFile());
		System.out.println();
		
		
//		String st[] = f.list();
//		
//		for (int i = 0; i < st.length; i++) 
//		{
//			System.out.println(st[i]);
//		}
//		
//		File f1[] = f.listFiles();
//		
//		for (int i = 0; i < f1.length; i++) 
//		{
//			System.out.println(f1[i]);
//		}
	
	}
}