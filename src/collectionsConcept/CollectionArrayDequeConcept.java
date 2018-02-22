package collectionsConcept;

import java.util.ArrayDeque;

public class CollectionArrayDequeConcept {

	public static void main(String[] args) 
	{
		ArrayDeque AD = new ArrayDeque();
		AD.add("A");
		AD.add("B");
		AD.add("C");
//		AD.add(null); //Cant add NUll Value.
		AD.addLast("F");
		AD.addFirst("Z");
		
		
		AD.remove(); //Will Remove First Element from Array (By default Remove Elements from Head of Array)
		AD.poll(); //Will Remove First Element from Array (By default Remove Elements from Head of Array)
		
		System.out.println(AD);
		
		System.out.println(AD.getLast());
		System.out.println(AD.getFirst());
		System.out.println(AD.peek());
		System.out.println(AD.peekFirst());
		System.out.println(AD.peekLast());
		System.out.println(AD.offer("A"));
		System.out.println(AD.offerFirst("B"));
		System.out.println(AD.offerLast("F"));
		System.out.println(AD.offer("X"));
		
	}

}
