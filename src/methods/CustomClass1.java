package methods;

class  CustomClass1
{
	public static void main(String[] args) 
	{

		  Student st1=new Student();
		  Student st2=new Student();
		  
		  Student.collcode = 100;

		  st1.name = "Sarava";
		  st1.sid = 10050;

		  st2.sid=10051;


		  st1.info();

		
	}
}

class Student
{
	
	static int collcode;
	String name;
	int sid;
	double per;
	

	void info()
	{
	System.out.println(" " +name);
	System.out.println(" " +sid);
	System.out.println(" " +collcode);
	System.out.println(" " +per);

	}

}
