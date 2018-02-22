package inheritance;

class InheritanceConcept
{
	public static void main(String[] args) 
	{
		Student1 s1 = new Student1("Sarava"); // When we create objects to Sub-Class, memory will be create to Super-Class & Sub-Class Members also.

//		s1.eat(); // We can not access the Super-Class Properties 
//		s1.sleep(); // We can not access the Super-Class Properties 
		s1.study(); // We can access the Sub-Class Properties 
		

		System.out.println();

		Person1 p1 = new Person1("Sarava","Male",28); //When we create objects to Super-Class, memory will be allocate to Super-Class Member only.
		p1.eat(); // We can access only Super-Class Members only
		p1.sleep(); // We can access only Super-Class Members only
//		p1.Study(); // we can not not access the Sub-Class member. 

		//Hence Suggestion is Creation of Object for Sub-Class is Good//
	}
}

class Person1
{
	String name; 
	String gender;
	int age;
	
	Person1(String name, String gender, int age)
	{
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	void eat()
	{
		System.out.println("Person is eating. "); 
	}

	void sleep()
	{
		System.out.println("Person is sleeping");
	}
}

class Student1
{
	String name;
	Student1(String name)
	{
		this.name = name;
	}
	void study()
	{
		System.out.println("Student is Studying");
	}

}
