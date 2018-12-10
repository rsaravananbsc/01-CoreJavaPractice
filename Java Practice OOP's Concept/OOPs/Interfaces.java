package OOPs;

public class Interfaces {

	public static void main(String[] args) {
	
		WebBrowser wb1 = new Chrome();
		WebBrowser wb2 = new FireFox();
		
		wb1.openBrowser(); wb2.openBrowser();
 	}
}

interface WebBrowser
{	
	abstract void openBrowser();
}

class Chrome implements WebBrowser
{
	@Override
	public void openBrowser() {
		System.out.println("FireFox Browser Will Open");		
	}
}

class FireFox implements WebBrowser
{
	@Override
	public void openBrowser() {
		System.out.println("FireFox Browser Will Open");	
	}
}

//An interface in java is a blueprint of a class. It has static constants and abstract methods only.
//The interface in java is a mechanism to achieve fully abstraction. 
//There can be only abstract methods in the java interface not method body. 
//It is used to achieve fully abstraction and multiple inheritance in Java.
//Java Interface also represents IS-A relationship.
//It cannot be instantiated just like abstract class.