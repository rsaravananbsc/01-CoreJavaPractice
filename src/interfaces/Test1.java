package interfaces;

public class Test1 
{

	public static void main(String[] args) 
	{
		check t = new check()
		{
		//how????????????????
            public void message() 
            {
                System.out.println("Method defined in the interface");
            }
		};
        t.message();
	}

}


interface check 
{
    public void message();
}
