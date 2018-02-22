package mcqjava;

public class Test7 {

	public static void main(String[] args) 
	{
		Box a = new Box();
		a.width = 10;
		a.height = 2;
		a.length =10;
		
		int y = a.width * a.length * a.height;
		
		System.out.println(y);
		
	}

}

class Box
{
	int width;
	int height;
	int length;
}
