package SortingConcepts;

public class BubbleSortOrder {

	public static void main(String[] args) {
		
		int[] num = {3,60,35,2,45,320,5};
		
		int n = num.length;
		int temp = 0;
		
		System.out.println("Before BubbleSort");
		for (int i = 0; i < num.length; i++) {
			System.out.print(+num[i] +" ");
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n-i; j++) {
				if (num[j-1] > num[j]) {
					temp = num[j-1];
					num[j-1] = num[j];
					num[j] = temp;
				}	
			}
		}
		
		System.out.println();
		System.out.println("After BubbleSort");
		for (int i = 0; i < num.length; i++) {
			System.out.print(+num[i] +" ");
		}
		
		
		
	}

}
