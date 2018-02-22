package methods;

class  CustomClass
{
	public static void main(String[] args) 
	{

		System.out.println("Main Class Started");
		Person.name = "Saravanan";
		Person.age = 27;
		Person.add = "BTM";
		Person.mob = 1234567890L;
		Person.aadh = 123456;


		System.out.println(" Name : " + Person.name);
		System.out.println(" Age : " + Person.age);
		System.out.println(" Address: " + Person.add);
		System.out.println(" Mobile No: " + Person.mob);
		System.out.println(" Identity No: " + Person.aadh);		
		
	}
}

class Person
{
	static String name, add;
	static int age;
	static long mob, aadh;
}