package NumberFunctions;

public class PrintEvenNumbers {

	public static void main(String[] args) {
		
		
		int[] arr = {10,20,35,67,12,23,34,45,56,67,78,89,90};
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2 == 0) {
				System.out.print(arr[i] +" ");
			}
		}	
	}

}
