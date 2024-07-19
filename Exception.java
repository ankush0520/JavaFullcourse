class Test
{
	public static void main(String[] args)
	{
		System.out.println("Main method statred");
		int a=10,b=0,c;
        try
        {
        	c=a/b; // c=10/0;
		    System.out.println(c);
        }
        catch(Exception e)  //we can write ArithmeticException  instead of Exception because it is arithmetic exception
        { 

		 System.out.println(e);
        }

		System.out.println("Main method ended");
	}
}
/////////
