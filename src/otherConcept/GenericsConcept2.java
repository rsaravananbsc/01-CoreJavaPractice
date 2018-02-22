package otherConcept;

public class GenericsConcept2 
{
	public static void main(String[] args) 
	{
		Student st1 = new Student(10, "Sara", 60.67);
		Student st2 = new Student("Kara", 10, 80.67);
		Student st3 = new Student(90.67, "Mara", 10 );
		Student<Integer,String,Double> st4 = new Student(20, "Jesh", 80.0);
		Student<String,Integer,Double> st5 = new Student("Jesh",20,  80.0);
		Student<Double,String,Integer> st6 = new Student(20.0, "Jesh", 80);
		
		System.out.println(st1); System.out.println(st1.id);
		
		System.out.println(st2); System.out.println(st2.id);
		
		System.out.println(st3); System.out.println(st4.id);
		
		System.out.println(st4); System.out.println(st4.id);
		
		System.out.println(st5); System.out.println(st5.id);
		
		System.out.println(st6); System.out.println(st6.id);
			
	}
}

class Student<I,N,P>
{
	I id;
	N name;
	P per;
	
	public Student(I id, N name, P per) 
	{
		super();
		this.id = id;
		this.name = name;
		this.per = per;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", per=" + per + "]";
	}
	
}

