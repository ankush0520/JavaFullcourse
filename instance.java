class A{

A()
{
	System.out.println("Default Constructor");
}
{//instance blocks
 System.out.println("Instance block");//instance block is called before default constructor
}
public static void main(String[] args)
{
	A ref=new A();
}
}
