class A{

	A()
	{
      this(25);//here this keyword is calling parameterized constructor from default constructor
	}
	A(int a)
	{
		
        System.out.println(a);
	}
	
	public static void main(String[] args)
	{
		 A ref=new A();
		
	}
}
////
