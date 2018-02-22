package collectionsConcept;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.concurrent.DelayQueue;

public class CollectionDequeConcept
{
	public static void main(String[] args) 
	{ 
		ArrayDeque aq = new ArrayDeque();
		
		aq.add("A");
		aq.addFirst("B");
		aq.addLast("C");
		aq.addFirst("D");
		aq.addLast("A");
		
		System.out.println(aq);
		
		
	}
}
