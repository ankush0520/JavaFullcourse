class A //super class
{
	void input()
	{
		System.out.println("Enter Your Name:");
	}
}
class B extends A //sub1 class
{
	void show()
	{
		System.out.println("My name is Ankush.");
	}
}
class C extends A //sub2 class
{
	void disp()
	{
		System.out.println("My name is Kumar.");
	}
}
class Demo
{
	public static void main(String[] args)
	{
		B r=new B();
		C r1=new C();
		r.input();
		r.show();
		r1.input();
		r1.disp();
	}
}
//////////
