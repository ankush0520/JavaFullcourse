                        /*By Extending thread class*/
class A extends Thread
{
	@Override
	public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
		    {
			  System.out.println("Ankush");
			  Thread.sleep(1000); 
		    }
		}
		catch(InterruptedException i)
		{

		}
		
	}
}
class b
{
	public static void main(String[] args) throws InterruptedException
	{
		A t=new A();
		t.start();
		for(int i=0;i<5;i++)
		{
			System.out.println("Ekram");
			Thread.sleep(1000);
		}
	}
}
///////
