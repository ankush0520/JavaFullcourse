                        /*By Implementing Runnable interface*/
class A implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("My Child Thread");
		}
	}
}
class b
{
	public static void main(String[] args) 
	{
		A r=new A();
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<5;i++)
		{
			System.out.println("Main Thread");
		}
	}
}
////////////
