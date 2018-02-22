package exceptionhandling;

public class ExceptionHandling3 {

	public static void main(String[] args) 
	{
		System.out.println("Main Method Started");
			
		try
		{
		String str = null;
		System.out.println(str.length());
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		catch (Exception e) 
		{
			System.out.println("Exception Error Occured");
			e.printStackTrace();
		}
		
		//If you write parent exception all the exception will be catch by Parent one. hence Child one's are became useless. 
		//Hence always write Parent Exception should be at end of the other Child exception case.
	
	}

}
