package OOPs;

public class HAS_A_Relationship {

	public static void main(String[] args) 
	{
		Employee obj=new Employee();
		System.out.println("Salary is:"+obj.salary); 
	}
}

class Employee
{  
	float salary=30000;  
}  
class Developer extends Employee
{ 
	float bonous=2000;
}

//A Employee has several developers. Without existence of Employee there is good chance for the developers to exist. 
//Hence Employee and Developer are loosely associated and this loose association is known as Aggregation.