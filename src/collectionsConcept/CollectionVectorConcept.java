package collectionsConcept;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class CollectionVectorConcept {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Vector V = new Vector(10,5);
		
		
		System.out.println("Default Size:"+V.capacity());
		System.out.println("Stored Size:"+V.size());
		
		for (int i = 1; i <= V.capacity(); i++) 
		{
			V.add("JSP"+i);
		}
		
		System.out.println("Default Size:"+V.capacity());
		System.out.println("Stored Size:"+V.size());
		V.addElement("QSP");
			
		System.out.println("Default Size:"+V.capacity());
		System.out.println("Stored Size:"+V.size());
		
		Enumeration en = V.elements();
		System.out.println("Access Vector Elements by Enumerationss");
		while (en.hasMoreElements()) 
		{
			Object obj = (Object) en.nextElement();
			System.out.println(obj);
		}
	}
}

