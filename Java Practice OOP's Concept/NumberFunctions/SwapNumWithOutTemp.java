package NumberFunctions;

public class SwapNumWithOutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		
		System.out.println("Before Swap");
		System.out.println(a);
		System.out.println(b);
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("After Swap");
		System.out.println(a);
		System.out.println(b);
	}
	
	

}
