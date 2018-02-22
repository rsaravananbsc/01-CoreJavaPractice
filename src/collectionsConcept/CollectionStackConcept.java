package collectionsConcept;

import java.util.Stack;

public class CollectionStackConcept
{

	public static void main(String[] args) 
	{
		
		Stack stk = new Stack();
		
		stk.push("A");
		stk.push("B");
		stk.push("C");
		stk.push("D");
		
		System.out.println(stk);
		System.out.println("Size:"+stk.size());//To get Size of Stack Size.
		System.out.println("Peek:"+stk.peek()); //Used to fetch last added record.
		System.out.println(stk.size());
		System.out.println("--------------------");
		System.out.println("Pop:"+stk.pop()); //Used to delete and display the last added record.
		System.out.println(stk.size());
		
		System.out.println("Search "+stk.search("A"));
		System.out.println("Search "+stk.search("B"));
		System.out.println("Search "+stk.search("C"));
		System.out.println("Search "+stk.search("D"));
		System.out.println("Search "+stk.search("AA"));
				
	}
}
