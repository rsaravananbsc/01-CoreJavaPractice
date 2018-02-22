package collectionsConcept;

import java.util.LinkedHashSet;

public class CollectionLinkedHastSetConcept 
{

	public static void main(String[] args) 
	{
		LinkedHashSet LHS = new LinkedHashSet();
		
		LHS.add("A");
		LHS.add("A");
		LHS.add("123");
		LHS.add("1234ABC");
		LHS.add(null);
		LHS.add(null);
		
		System.out.println(LHS);

	}

}
