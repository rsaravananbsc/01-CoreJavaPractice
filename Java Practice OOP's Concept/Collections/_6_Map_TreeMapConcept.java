package Collections;

import java.util.*;

public class _6_Map_TreeMapConcept
{
	public static void main(String[] args) 
	{
		TreeMap TM = new TreeMap(); 
		//Keys must be Non-Null & Unique 
		//Its Maintains the Natural Sorting Order
		//Heterogeneous are not allow.
		
		TM.put(1, "Santhosh");
		TM.put(4, "Srikanth");
		TM.put(3, "Saravanan");
//		TM.put(null, "Saravanan"); //Null Pointer Exception 
		TM.put(5, "Suresh");
		TM.put(2, "Ramesh");
//		TM.put("A", "Kamesh"); //Class cast Exception
	
		Set s = TM.entrySet();
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
