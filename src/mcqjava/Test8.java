package mcqjava;

public class Test8 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Boxx a = new Boxx();
		Boxx b = new Boxx();
		a.width = 10;
		a.height = 2;
		a.length =10;
		
		b = a;
		
		System.out.println(b.height);

	}

}

class Boxx
{
	int width;
	int height;
	int length;
}


