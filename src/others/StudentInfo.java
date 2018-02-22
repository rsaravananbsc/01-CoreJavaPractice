package others;
class StudentInfo
{
	public static void main(String[] args) 
	{
		Student s1 = new Student("Sara",123,89.0); // passing the values to fields member while creating object 
		Student s2 = new Student("Kara",321,90);
		s1.info();
		System.out.println("_____________________");
		s2.info();
	}
}

class Student
{
	String name;
	int sid;
	double per;

	Student(String nm, int id, double perc) //receiving the passed values by aruguments.
	{
		name = nm; //Stroring the value temp varibale to permanent variables. 
		sid = id;
		per = perc;
	}

	void info()
	{
//		name = nm; //Stroring the value temp varibale to permanent variables. 
//		sid = id;
//		per = perc;

		System.out.println("Student Name: " +name);
		System.out.println("Student ID:" +sid);
		System.out.println("Student Percentage: " +per);
	}

}