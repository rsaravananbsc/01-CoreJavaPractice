package NumberFunctions;

import java.util.Scanner;

public class FindLargestNumber {

	public static void main(String[] args) {
		
		int[] arr = {3,60,35,2,45,320,5,15,18,27,29,65,48,95,75,35,48,95,152};		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number to Find:");
		int key = sc.nextInt();
		System.out.println(FindNumber(arr,key));
	}

	private static int[] FindNumber(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

}
