package exceptionhandling;

public class ExceptionHandling17 
{
	public static void main(String[] args) //User-Defined Exception
	{
		Propose pos = new Propose();
		
		try 
		{
			pos.getPropose("rose");
		} 
		catch (Girls e) 
		{
			e.printStackTrace();
		}
	}
}

class Propose 
{
	void getPropose(String flower) throws Girls
	{
		if(flower.equalsIgnoreCase("rose"))
			throw new Girls("I Love You");
		else
			throw new Girls("I Hate You");
	}
}

class Girls extends Exception
{
	Girls()
	{
		
	}
	Girls(String msg)
	{
		super(msg);
	}
}




