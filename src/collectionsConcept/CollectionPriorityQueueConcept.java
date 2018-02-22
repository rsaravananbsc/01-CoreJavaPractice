package collectionsConcept;

import java.util.PriorityQueue;

public class CollectionPriorityQueueConcept 
{
	public static void main(String[] args) 
	{
		PriorityQueue pq = new PriorityQueue();
		pq.add("C");
		pq.add("A");
		pq.add("B");
		System.out.println(pq);
		System.out.println(pq.poll()); //used to remove
		System.out.println(pq); //Display elements
		System.out.println(pq.element()); //Next removable elements info
		System.out.println(pq.peek()); // Which elements needs to delete.
		System.out.println(pq.remove()); //Removing from Queue. 
		pq.offer("X");
		pq.add(null); //Null is not allowed.
		//System.out.println(pq);
		
		
	}
}
