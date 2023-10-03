                 /* Run-Time Polymorphism */
                 /* Method Overridding */
class shape //super class
{
	void draw()
	{
		System.out.println("Can't say shape type");
	}
}
class square extends shape  //sub class
{
	@Override   //method overidding
	void draw()
	{
		super.draw();
		System.out.println("Square Shape");
	}
}
class Demo
{
   public static void main(String[] args)
   {
   	shape r=new square();
   	r.draw();
   }
}