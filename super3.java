class A{
	A(int a)
	{
		System.out.println("Hello world"+ a);
	}
}
class B extends A{

   B()
   {
   	super(20); //in the case of parameterized constructor it is necessary to write super keyword for access super class constructor
   	System.out.println("Hello Ankush");
   }
}
class Test{
	public static void main(String[] args)
	{
		B c=new B();
	}
}
////////////
