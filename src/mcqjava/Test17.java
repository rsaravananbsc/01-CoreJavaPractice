package mcqjava;

public class Test17 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int x,y = 1;
		x =10;
		
		if (x!= 10 && x/0 == 0)
			System.out.println("IF PART"+y);
		else 
			System.out.println("Else Part:"+(++y));

	}

}
