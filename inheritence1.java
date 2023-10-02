class A  //super class
{
	int a,b,c;
	void add()
	{
		a=10;
		b=20;
		c=a+b;
		System.out.println("Summution of two Numbers :"+c);
	}
	void sub()
	{
		a=200;
		b=100;
		c=a-b;
		System.out.println("Substraction of two Numbers :"+c);
	}
}
class B extends A //sub1 class
{
	void multi()
	{
		a=10;
		b=20;
		c=a*b;
		System.out.println("Multiplication of two Numbers :"+c);
	}
	void div()
	{
		a=20;
		b=10;
		c=a/b;
		System.out.println("Division of two Numbers :"+c);
	}

}
class C extends B //sub2 class
{
	void rem()
	{
		a=10;
		b=3;
		c=a%b;
		System.out.println("Remainder of two Numbers :"+c);
	}
	public static void main(String[] args)
	{
		C x=new C();
		x.add();
		x.sub();
		x.multi();
		x.div();
		x.rem();
	}
}