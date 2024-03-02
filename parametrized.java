class A{
	int x,y;
	A(int a,int b)//parametrized constructor
	{
	  x=a;
	  y=b;

	}
	A(int a,String b)//parametrized constructor
	{
	  System.out.println(a+" "+b);
	}
	void show(){
	System.out.println(x+" "+y);
	}
}
class B{
	public static void main(String args[])
	{
	 A ans=new A(100,200);
	 ans.show();
	 A ref=new A(10,"Ankush");
	}
}
////////////////
