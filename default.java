class A{
	int a;
	String b;
	boolean c;
	A()//default constructor
	{
	  a=25;
	  b="Ankush";
	  c=true;

	}
	void show(){
	System.out.println(a+" "+b+" "+c);
	}
}
class B{
	public static void main(String args[])
	{
	 A ans=new A();
	 ans.show();
	}
}
/////
