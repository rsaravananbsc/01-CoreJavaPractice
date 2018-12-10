package OOPs;

public abstract class Abstraction {
	public static void main(String[] args) {
		
		Shapes sh1, sh2 = null;
		
		sh1 = new Circle(10.0);
		sh2 = new Rectangle(25.0);
		
		System.out.println(sh1.getArea());
		System.out.println(sh2.getArea());
	}
}

abstract class Shapes
{
	//Constructor Can create in Abstraction Class and can Achieve 0-100% Abstraction.
	//Because Abstract can have Abstract Method as well as Generic Methods.
	Shapes()  		
	{  
		super();
	}
	
	abstract double getArea(); //Abstracted Method should be implement on Sub-Class
	
	void getResult() 
	{
		
	}
		
}

class Circle extends Shapes
{
	double r;
	public Circle(double r) {
		this.r = r;
	}

	@Override
	public double getArea() {
		return 3.14 * r * r;
	}
	
}

class Rectangle extends Shapes
{
	double r;
	public Rectangle(double r) {
		this.r = r;
	}

	@Override
	public double getArea() {
		return 2 * 3.14 * r;
	}
	
}
// Definition: abstraction is a process of hiding the implementation details from the user, 
//             only the functionality will be provided to the user.

//1. JVM Wont allows to create object to Abstracted Class
//2. If Sub Class refer a Sub Class Object, we can access SubClass Members as well Super Class Members
//3. If Super Class refer a Sub Class Object, we can access only Super Class Members,
//Sub Class Abstracted Members Only
//4. We can not create Object for Shapes class because its a Abstracted Class
//5. All of the Methods from Abstracted class should be implement on Subclass
//6. MainClass can be declare Abstract Class because MainMethod is a Static
//7. We can create Constructor in Abstracted Class




