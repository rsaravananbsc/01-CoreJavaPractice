package first;

public class Test2 
{
	public static void main(String[] args) 
	{
		Add a1 = new Add();
		a1.getAddtion(10, 20);
		System.out.println(a1.getAddtion(10, 10));
		Mul a2 = new Mul();
		a2.getMultiply(20, 20);
		System.out.println(a2.getMultiply(10, 10));
	}
}

class Add
{
	int getAddtion(int a, int b)
	{
		return a+b;
	}
}

class Mul
{
	int getMultiply(int a, int b)
	{
		return a*b;
	}
}
