package collectionsConcept;

import java.util.ArrayList;
import java.util.ListIterator;

public class CollectionListConcept5 {

	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		
		al.add("A");
		al.add("B");
		al.add("c");
		al.add("D");
		al.add("E");
		
		System.out.println(al);
		ListIterator li = al.listIterator();
		
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("------------");
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
		
		while(li.hasNext())
		{
			if("c".equals(li.next()))
			{
				break;
			}
		}
		li.set("EC");
		li.add("F");
		al.add("F");
		
		System.out.println(al);
		
	}

}
