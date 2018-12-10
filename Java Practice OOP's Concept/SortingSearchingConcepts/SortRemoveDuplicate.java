package SortingSearchingConcepts;


import java.util.TreeSet;

public class SortRemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Remove Duplicates & Sort by Ascending Order 
		int[] arr = {10,25,45,67,78,89,23,56,2,55,77,10,45};
		
		TreeSet<Integer> ts = new TreeSet<Integer>(); //TreeSet Wont Allow Duplicates & keeps Ascending Order
		
		for (int i = 0; i < arr.length; i++) {
			ts.add(arr[i]);
		}
				
		for (Integer val : ts) {
			System.out.print(val+ " ");
		}
	
	}
}
