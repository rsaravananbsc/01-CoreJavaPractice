package map;

import java.util.*;

public class MapConceptTreeMap2
{
	public static void main(String[] args) 
	{
		TreeMap TM = new TreeMap<String, String>(new MyAscName());
		
		TM.put("Java", "Language");
		TM.put("Computer", "Machine");
		TM.put("India", "Country");
		TM.put("Mango", "Fruit");
		
		Set keys = TM.entrySet();
		for (Object object : keys) 
		{
			System.out.println(object);
		}
		
	}
}

class MyAscName implements Comparator
{
	public int compare(String str1, String str2) 
	{
		return str1.compareTo(str2);
	}

	@Override
	public int compare(Object arg0, Object arg1) 
	{
		return 0;
	}
}