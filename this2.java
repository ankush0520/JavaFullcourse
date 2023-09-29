class A{

	A()
	{
       System.out.println("Ankush");
	}
	A(int a)
	{
		this();//here this keyword is calling default constructor from parametrized constructor
        System.out.println(a);
	}
	
	public static void main(String[] args)
	{
		 A ref=new A(100);
		
	}
}