package collectionsConcept;

import java.util.ArrayList;
import java.util.ListIterator;

public class CollectionListConcept4 {

	public static void main(String[] args) 
	{
		ArrayList al1 = new ArrayList();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(40);
		al1.add("ABC");
		
		System.out.println(al1.size());
		
		ArrayList al2 = new ArrayList(10);
		al2.add(50.0);
		al2.add(83.68);
		al2.add("JSP");
		
		al2.addAll(al1);
		
		System.out.println(al2.size());
		
		ArrayList al3 = al1; //AL3 also Referring AL1 Arraylist
		ArrayList al4 = new ArrayList(al1); //AL4 also referring AL1 ArrayList
		
		System.out.println(al4.size());
		
		
		System.out.println("--------------------------------------------------");
		
		ListIterator LI = al1.listIterator();
		
//		System.out.println(LI.hasNext());
//		System.out.println(LI.next());
//		System.out.println(LI.hasNext());
//		System.out.println(LI.next());
//		System.out.println(LI.hasNext());
//		System.out.println(LI.next());
//		System.out.println(LI.hasNext());
//		System.out.println(LI.next());
//	
		
		
		System.out.println(LI.hasPrevious());
		System.out.println(LI.next());
		System.out.println(LI.nextIndex());
		System.out.println(LI.previousIndex());
		
		System.out.println("---------------------");
		LI.set(al2);
		LI.add(al3);
		
	
		
		
		
		
	}

}
