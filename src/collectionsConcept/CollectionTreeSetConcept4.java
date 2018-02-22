package collectionsConcept;

import java.util.Comparator;
import java.util.TreeSet;

public class CollectionTreeSetConcept4 
{
	public static void main(String[] args) 
	{
		TreeSet TS = new TreeSet(new MyAsce());
		
		TS.add("F");
		TS.add("G");
		TS.add("T");
		TS.add("X");
		TS.add("E");
		TS.add("H");
		TS.add("R");
		
		System.out.println(TS);
		
		TreeSet TS1 = new TreeSet(new MyDesc());
		TS1.addAll(TS);	
		
		System.out.println(TS1);
			
	}
}

class MyAsce implements Comparator
{
	@Override
	public int compare(Object obj1, Object obj2) 
	{
		String str1 = (String)obj1;
		String str2 = (String)obj2;
		return str1.compareTo(str2);
	}
}

class MyDesc implements Comparator
{
	@Override
	public int compare(Object obj1, Object obj2)
	{
		String str1 = (String)obj1;
		String str2 = (String)obj2;
		return -str1.compareTo(str2);
	}
}