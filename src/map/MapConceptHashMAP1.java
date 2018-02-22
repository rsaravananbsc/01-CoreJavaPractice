package map;

import java.util.*;

public class MapConceptHashMAP1 
{
	public static void main(String[] args) 
	{
		HashMap hm = new HashMap();  //Dont Follow Inserion Order
		
		hm.put(123, "Santhosh");
		hm.put(125, "Srikanth");
		hm.put(124, "Saravanan");
	
		
		Set s = hm.entrySet();
		for (Object object : s) 
		{
			System.out.println(object);
		}
		System.out.println("---------------------------");
		for (Object object1 : s) 
		{
			Map.Entry e = (Map.Entry)object1;
			System.out.println(e.getKey()+"----"+e.getValue());
		}
	}
}
