class A{
	void show()
	{
		System.out.println("Hello world");
	}
}
class B extends A{

   void show()
   {
   	
    super.show();//for super class method
   	System.out.println("Hello Ankush");
   }
}
class Test{
	public static void main(String[] args)
	{
		B c=new B();
		c.show();
	}
}
/////////
