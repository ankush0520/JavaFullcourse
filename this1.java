class A{

	int a; //instance variable
	A(int a) //local variable
	{
		this.a=a;//here this will decide that 100 will be assign to instance variable
	}
	void show()
	{
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		 A ref=new A(100);
		 ref.show();
	}
}