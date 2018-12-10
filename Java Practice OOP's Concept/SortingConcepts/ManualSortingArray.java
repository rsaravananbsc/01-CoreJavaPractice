package SortingConcepts;

public class ManualSortingArray {

	public static void main(String[] args) {
		
		int[] arr = {90,89,78,67,34,12,45,67,78,34,56,99};
		int tempvar;
		
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				if (arr[i] > arr[j]) 
				{
					tempvar = arr[j];
					arr[j] = arr[i];
					arr[i] = tempvar;
					
				}
			}
		}
		
		for (int i : arr) {
			System.out.print(i +" ");
		}

	}
}
