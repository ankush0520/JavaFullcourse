class A{
	int a;
	double b;
	String c;
	private A()//private constructor is not accessed outside the class
	{
		a=10;
		b=30.99;
		c="Ankush";
	     System.out.println(a+" "+b+" "+c);
	}
	public static void main(String[] args)
	{
		A ans=new A();
	}
}
//
