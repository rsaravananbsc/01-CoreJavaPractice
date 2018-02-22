package arrayconcept;
class  ArrayConcept4 // Non-Primitive Array
{
	public static void main(String[] args) 
	{
		Pen p[] = {new Pen("Green"), new Pen("Blue"), new Pen("Red")}; // Assigning Multiple Array Value to variables.

		for (int i=0;i<p.length;i++ )
		{
			//System.out.println(p[i]);
			p[i].write();
		}
		
	}
}
class Pen
{
	String color;

	Pen(String color)
	{
		this.color = color;
	}
	void write()
	{
		System.out.println(color+"Colour Pen is Writing");
	}
}

