package casting;

public class UpDownCasting4
{
	public static void main(String[] args)
	{
		Bank b[] = {new ICICIBank(), new SBIBank(), new DBSBank()};
		
//		System.out.println("ICICI Bank Interest Rate: "+b[0].getInterest());
//		System.out.println("SBI Bank Interest Rate: " +b[1].getInterest());
//		System.out.println("DBS Bank Interest Rate: " +b[2].getInterest());
		
		for (int i = 0; i < b.length; i++) 
		{
			if(b[i] instanceof ICICIBank)
			{
				System.out.println("ICICIBANK Interest	:"+b[i].getInterest());
			}
			else if(b[i] instanceof SBIBank)
			{
				System.out.println("SBIBANK Interest	:"+b[i].getInterest());
			}
			else if(b[i] instanceof DBSBank)
			{
				System.out.println("DBSBANK Interest	:"+b[i].getInterest());
			}
			else 
			{
				System.out.println("None of the Object been Referred");
			}
		}
	}
}

interface Bank
{
	double getInterest();
}

class ICICIBank implements Bank
{
	
	public double getInterest()
	{
		return 8.45;
	}
}

class SBIBank implements Bank
{

	public double getInterest() 
	{
		return 9.56;
	}
	
}

class DBSBank implements Bank
{

	public double getInterest() 
	{
		return 10.45;
	}
	
}
