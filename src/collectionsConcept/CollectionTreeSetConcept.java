package collectionsConcept;

import java.util.*;

public class CollectionTreeSetConcept 
{

	public static void main(String[] args) 
	{
		TreeSet ts = new TreeSet();
		
		ts.add("E");
		ts.add("B");
		ts.add("G");
//		ts.add(123); //No Arg TreeSet Type Constructor wont allow Homogeneous elements only. so Class Cast Error will come.
		
		System.out.println(ts);
		
		for (Object object : ts) 
		{
			System.out.println(object);
		}
		
		java.util.Iterator it = ts.iterator();
		while (it.hasNext()) 
		{
		System.out.println(it.next());
		}

	}

}
