package Collections;

import java.util.ArrayList;

public class _1_List_ArrayListConcept
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		
		//List Allows Duplicates
		//List Allows More than one Nulls
		//List is Keeps Insertion Order
		al.add("Suresh");
		al.add("Ramesh");
		al.add("Saravanan");
		al.add("12345");
		al.add(null);
		al.add(1234);
		al.add(1230.87);
		al.add("Suresh");
		
		System.out.println("Collection List Elements");
		System.out.println("----------------------------");
		for (int i = 0; i < al.size(); i++) 
		{
			System.out.println(al.get(i));
		}
		System.out.println("----------------------------");
		System.out.println("Components of Collection Concept");
		System.out.println("Size of Collection:"+al.size());		
		System.out.println("Fetching Record:"+al.get(1)); //By using Index
		System.out.println("Searching Contents:"+al.contains("Saravanan")); //Searching by Object
		System.out.println("Searching Contents:"+al.contains("Sara")); //By Searching Partial Object
		System.out.println("Removing Elements:"+al.remove(1)); //Removing by Index return Deleted Elements Details
		System.out.println("Removing Elements:"+al.remove("12345")); //Removing by Object return boolean Value answers
		System.out.println("Getting Index:"+al.indexOf("Suresh")); //Finding Index by Object
		System.out.println("Checking Collection is Empty Or Not:"+al.isEmpty()); //Returns True if ArrayList is Empty or False
		System.out.println("Last Index of:"+al.lastIndexOf("Suresh")); //Searching last Index by Object
		System.out.println("Last Index of:"+al.lastIndexOf("Sara")); //If Searched Object not found Returns -1
		
		System.out.println("----------------------------");
		
		Object obj[] = al.toArray(); //Convert Collection to Array Object
		
		System.out.println("Size of Array:"+obj.length);
		for (int i = 0; i < obj.length; i++) 
		{
			System.out.println(obj[i]);
		}
		
		al.clear(); //Clearing All the Elements in Collection Array.
		
		System.out.println("Records Is Present or Not:"+al.isEmpty()); //Returns true when no records in Array
		
	}
}
