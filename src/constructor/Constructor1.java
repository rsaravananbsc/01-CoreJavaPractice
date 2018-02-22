package constructor;

class Constructor1 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Method Started");
		Cons c1 = new Cons("Green");
		c1.write();
	}
}

class Cons
{
	String color;
		Cons(String color) 
	{
		this.color = color;
	}

	void write()
	{
		System.out.println(color +" Pen Is Writing");
	}
}
