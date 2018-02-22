package methods;

class Pen
{
	static  String colour,c_name;
	static double price;

	static void write()
	{
		System.out.println( colour+ " is writing");
	}
}


class  CustomClassMethod
{
	public static void main(String[] args) 
	{
		System.out.println("Main Class Started");
		Pen.colour = "Black";
		Pen.c_name = "Reynolds";
		Pen.price = 50;

		System.out.println(" Pen Colour : " +Pen.colour);
		System.out.println(" Pen Company : " +Pen.c_name);
		System.out.println(" Pen Price : " +Pen.price);

		Pen.write();
		//System.out.println("_______________________");
		//Pen.write("Blue");
		//Pen.write();

	}
}
