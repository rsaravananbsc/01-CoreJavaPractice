//Write a Java Program to define a Employee Class and Store 2 Employee Information.

package methods;
class CustomClassMethodStatic2 
{
	public static void main(String[] args) 
	{
		Pen1 p1 = new Pen1();

		p1.name = "LongRunPen";
		p1.brand = "Parker";
		p1.price = 450;

		p1.peninfo();
		p1.penfunct();
	}
}

class Pen1
{
	String name,brand;
	double price;


	void peninfo()
	{
	System.out.println("Pen Brand" +brand);
	System.out.println("Pen Name" +name);
	System.out.println("Pen price" +price);
	}

	void penfunct()
	{
	System.out.println(" I am writing with " +brand +" Pen, and its Price is " + price); 
	}

}




