package collectionsConcept;

import java.util.HashSet;
import java.util.Iterator;

public class CollectionHashSetConcept {

	public static void main(String[] args) 
	{
		HashSet HS = new HashSet();
		
		HS.add("A");
		HS.add("B");
		HS.add("B");
		HS.add("C");
		HS.add("D");
		HS.add("E");
		HS.add(null);
		HS.add(null);
		
		System.out.println(HS.add("A"));
		System.out.println(HS.add(null));
		
		System.out.println(HS);
		HS.add(123);
		HS.add(23.45);
		System.out.println(HS);
		HS.remove("A");
		System.out.println(HS);
		
		
		System.out.println("1.<------------------------------->");
		Iterator it  = HS.iterator();
		while (it.hasNext()) 
		{
			Object object = (Object) it.next();
			System.out.println(object);
			
		}
		System.out.println("2.<------------------------------->");
		Object obj[] = HS.toArray();
		for (int i = 0; i < obj.length ; i++) 
		{
			System.out.println(obj[i]);
		}
		System.out.println("3.<------------------------------->");
		for (Object object : obj) 
		{
			System.out.println(object);
		}
		
	}
	
}
