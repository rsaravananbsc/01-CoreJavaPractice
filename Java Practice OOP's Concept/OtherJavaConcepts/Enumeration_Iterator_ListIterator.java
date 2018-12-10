package OtherJavaConcepts;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class Enumeration_Iterator_ListIterator {

	public static void main(String[] args) {
	
		//Enumeration Concept
		Vector v = new Vector();
		for(int i=0; i<=10;i++)
		{
			v.addElement(i);
		}
		
		System.out.println(v); //[0,1,2,3,4,5,6,7,8,9,10]
		
		Enumeration e = v.elements();
		while (e.hasMoreElements()) {
			Object object = e.nextElement();
			System.out.println(object);
		}
		
		//Enumeration
		//1.Only For Legacy classes
		//2.Only forward direction (Single Direction Cursor)
		//3.Only read access
		//4.Can Read collection By using elements() method of vector class
		
//********************************************************************************************************************************
		
		//Iterator Concept
		ArrayList al = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			al.add(i);
		}
		
		System.out.println(al);
				
		Iterator it = al.iterator();
		
		while (it.hasNext()) {
			Object object = (Object) it.next();
			System.out.println(object);	
		}
		
		//Iterator
		//1.Any Collection classes
		//2.Only forward direction(single direction cursor)
		//3.Both read and remove
		//4.Can Read collection By using iterator method of collection

//********************************************************************************************************************************
	 
		//List Iterator
		LinkedList l=new LinkedList();
		l.add("Sam");
		l.add("Tom");
		l.add("Ron");
		l.add("Jack");
		System.out.println(l); //[sam, Tom, Ron, Jack]
		
		ListIterator ltr=l.listIterator();
		while(ltr.hasNext())
		{
			String s=(String)ltr.next();
			if(s.equals("Tom"))
				ltr.remove(); // To remove element
			else if(s.equals("Jack"))
				ltr.add("Brad"); // To add element
			else if(s.equals("Ron"))
				ltr.set("RVD"); // to replace element
		}
		System.out.println(l); //[Sam,RVD,Jack,Brad]	

	}
}

//ListIterator
//1.Only List classes
//2.Both forward and backward direction(bidirectional)
//3.Read,remove,replace and addition of new object
//4.Can Read collection By using listIterator() method() of List interface
