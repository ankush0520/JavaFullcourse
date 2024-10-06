class A{
	A()
	{
		System.out.println("Hello world");
	}
}
class B extends A{

   B()
   {
   	//super(); //whether we write super keyword or not,but the compiler will take super keyword in the case of default constructor here
   	System.out.println("Hello Ankush");
   }
}
class Test{
	public static void main(String[] args)
	{
		B c=new B();
	}
}
