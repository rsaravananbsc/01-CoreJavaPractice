package collectionsConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionListConcept3 
{
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		
		al.add("Suresh");
		al.add("Ramesh");
		al.add("Saravanan");
		al.add("12345");
		al.add(null);
		al.add(1234);
		al.add(1230.87);
		al.add("Suresh");
		
		Iterator it = al.iterator();
		
		while (it.hasNext()) 
		{
			System.out.println(it.next());
		}
		
		System.out.println("------------------------");
		
		for (Object obj : al) 
		{
			System.out.println(obj);
		}
		
		
	}
}
