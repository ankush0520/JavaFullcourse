                      /* Compile Time Polymorphism */
                      /* Method Overloading */

class A
{
	int add()
	{
		int a=10,b=20,c;
		c=a+b;
		return c;
	}
	void add(int x,int y)
	{
		int c;
		c=x+y;
		System.out.println(c);
	}
	void add(int x,double y)
	{
		double c;
		c=x+y;
		System.out.println(c);
	}
	public static void main(String[] args)
	{
		A r=new A();
		int add=r.add();
		r.add(100,200);
		r.add(50,44.34);
		System.out.println(add);
	}
}
//////
