package map;

import java.util.*;

public class MapConceptLinkedHashMap
{
	public static void main(String[] args) 
	{
		LinkedHashMap LHM = new LinkedHashMap();  //Following Insertion Order
		
		LHM.put(1, "Santhosh");
		LHM.put(4, "Srikanth");
		LHM.put(3, "Saravanan");
		LHM.put(5, "Saravanan");
	
		Set s = LHM.entrySet();
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
