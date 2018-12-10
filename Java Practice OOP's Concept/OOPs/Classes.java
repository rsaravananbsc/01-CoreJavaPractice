package OOPs;

public class Classes {

	public static void main(String[] args) {
		
		//Anonymous Class
		MyClass m = new MyClass()
		{
			int a=10;
			void m1()
			{
				System.out.println("Hi");
			}
		}; //Anonymous Class
		
		System.out.println(new MyClass() {int a=50;}.a); //Only way to access Anonymous Class Members
		
		
		
		//InnerClass
		class subMainClass
		{
			int a=100;
			//static int b; //Not Accept Static variable, only Non-Static
		}
		
		subMainClass s = new subMainClass();
		System.out.println(s.a);
		
		//SingleTon Class
		
//		SingleTon s = new SingleTon(); // We cannot create Object OutSide of PriavteClass
		System.out.println(SingleTon.getTest());
		System.out.println(SingleTon.getTest());
		System.out.println(SingleTon.getTest());
	}
}

class MyClass //For Anonymous Class
{
	public MyClass() 
	{
		
	}
}

class SingleTon //For SingleTon Class
{
	private static final SingleTon t = new SingleTon();
	
	private SingleTon()
	{
		
	}
	public static SingleTon getTest()
	{
		return t;
	}
}

// Rules for Creation of SingleTon Class
// 1. Class Should have Private Constructor with return method Void.
// 2. Class Should have Public Static Methods/Variables with return Class Type.
// 3. Class Should have Private Static/Private Static Final Variables.
