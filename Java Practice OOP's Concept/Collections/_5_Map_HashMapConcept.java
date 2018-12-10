package Collections;

import java.util.*;

public class _5_Map_HashMapConcept
{
	public static void main(String[] args) 
	{
		HashMap hm = new HashMap();  
		
		hm.put(123, "Santhosh");
		hm.put(124, "Srikanth");
		hm.put(125, "Saravanan");
		
		System.out.println(hm);
		
		Object obj1 = hm.put(126, "Suresh");
		System.out.println(obj1);
		Object obj2 = hm.put(123, "Jeshani");
		System.out.println(obj2);
		hm.put("A", "123");
		
		System.out.println(hm);
		
		hm.put(null, "Sara");
		hm.put("null", "Jesh");
		hm.put(126, null);
		hm.put(127, "null");
		
		System.out.println(hm);
		
		System.out.println("------------------------------------------------------------------------");
		
		Set keys = hm.keySet();
		for (Object obj : keys) 
		{
			System.out.println(obj);
		}
		
		System.out.println("------------------------------------------------------------------------");
		
		for (Object obj : keys) 
		{
			System.out.println(obj+"------>"+hm.get(keys));
		}
		
		System.out.println("------------------------------------------------------------------------");
		
		Collection values = hm.values();
		Iterator it = values.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
	}
}
