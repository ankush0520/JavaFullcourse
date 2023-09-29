class A{
	int a;
	String b;
	A(int x,String y)//parametrized constructor
	{
		a=x;
		b=y;
	  System.out.println(a+" "+b);
	}
	A(A ref)//copy constructor with parameter
	{
		a=ref.a;
		b=ref.b;
	  System.out.println(a+" "+b);
	}
}
class B{
	public static void main(String args[])
	{
	 A ans=new A(10,"Ankush");
	 A ans1=new A(ans);
	}
}