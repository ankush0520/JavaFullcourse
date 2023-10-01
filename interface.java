interface vehical
{
	String Name="TVS"; //public + static + final
	int Speed=100;  //public + static + final

	void start(); //public + abstract
	void stop();  //public + abstract
    default void color()
	{
		System.out.println("TVS color is Red");
	}
}
class Customer implements vehical
{
	@Override
	public void start()
	{
		System.out.println("start(): insert key & press start button "+Name);
	}
	@Override
	public void stop()
	{
		System.out.println("stop(): exit key "+Name);

	}
	public static void main(String[] args)
	{
		Customer c=new Customer();
		c.start();
		c.stop();
		c.color();
		System.out.println(Speed);
	}
}