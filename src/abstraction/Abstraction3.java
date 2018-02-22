package abstraction;

public class Abstraction3 
{
	public static void main(String[] args) 
	{
		Bank b[] = {new ICICIBank(), new SBIBank(), new DBSBank()};
		
		System.out.println("ICICI Bank Interest Rate: "+b[0].getInterest());
		System.out.println("SBI Bank Interest Rate: " +b[1].getInterest());
		System.out.println("DBS Bank Interest Rate: " +b[2].getInterest());
		
	}

}

abstract class Bank
{
	abstract double getInterest();
}

class ICICIBank extends Bank
{
	@Override
	double getInterest() {
		// TODO Auto-generated method stub
		return 8.45;
	}
}

class SBIBank extends Bank
{

	@Override
	double getInterest() {
		// TODO Auto-generated method stub
		return 9.56;
	}
	
}

class DBSBank extends Bank
{

	@Override
	double getInterest() {
		// TODO Auto-generated method stub
		return 10.45;
	}
	
}


