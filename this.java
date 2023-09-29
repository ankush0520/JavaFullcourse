class A{
	void show()
	{
		System.out.println(this);
	}
	public static void main(String[] args)
	{
		 A ref=new A();
		 System.out.println(ref);
		 ref.show();
	}
}