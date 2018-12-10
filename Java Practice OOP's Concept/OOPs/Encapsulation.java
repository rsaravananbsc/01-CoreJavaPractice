package OOPs;

public class Encapsulation {

	public static void main(String[] args) {
	
		LoginPage lp = new LoginPage();
		
		lp.setUsername("saravanan");
		lp.setPassword("pass");
		
		System.out.println(lp.getUsername());
		System.out.println(lp.getPassword());
		
	}
}

class LoginPage
{
	private static String username;
	private static String password;
	
	public static String getUsername() {
		return username;
	}
	public static void setUsername(String username) {
		LoginPage.username = username;
	}
	public static String getPassword() {
		return password;
	}
	public static void setPassword(String password) {
		LoginPage.password = password;
	}	
}

//Encapsulation in Java is a mechanism of wrapping the data (variables) and code acting on the data (methods) 
//together as a single unit. In encapsulation, the variables of a class will be hidden from other classes, 
//and can be accessed only through the methods of their current class. Therefore, it is also known as data hiding.

// To achieve encapsulation in Java:
//Declare the variables of a class as private.
//Provide public setter and getter methods to modify and view the variables values.
