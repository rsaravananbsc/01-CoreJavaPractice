package SortingSearchingConcepts;

import java.util.Scanner;

public class LinerSearch {

	public static void main(String[] args) {
		
		int[] arr = {78,89,25,-26,49,53,95,18,2,36,99,100,52,64,50};
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any value to Find in Series of Numbers:");
		int key = sc.nextInt();
		
		System.out.println(LinearSearch(arr,key));
	
	}

	private static String LinearSearch(int[] Inputarr, int Inputkey) {
		
		for (int i = 0; i < Inputarr.length; i++) {
			if (Inputarr[i] == Inputkey) {
				return "Element is Found in Array At Position " +i;
			}
		}
		return "Element is Not Found";
	}

	

}
