package OOPs;

public class IS_A_Relationship {

	public static void main(String[] args) 
	{
		Science obj=new Science(); 
		System.out.println("Salary is:"+obj.salary);  
		System.out.println("Bonous is:"+obj.bonous); 
	}
}
class Faculty
{  
	float salary=30000;  
}  
class Science extends Faculty
{
	float bonous=2000;
}

// If Extends or Implementation keyword invoked in classes that is IS-A Relationship. 
// In this example there is no Faculty without subject. hence its strongly associated
// and this strong association is known as composition.
