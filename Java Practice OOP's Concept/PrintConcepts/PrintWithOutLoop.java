package PrintConcepts;

public class PrintWithOutLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(10);
	}

	private static void print(int n) 
	{
		if(n > 0)
		{
			print(n-1);
			System.out.println(n);
		}		
	}
}
