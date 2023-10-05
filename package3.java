//User-Defined package

package ankush;

class A
{
	protected void show()
	{
		System.out.println("Learn Coding....");
	}
	
}
class B extends A //sub class
{
  public static void main(String[] args)
  {
  	B r=new B();
  	r.show();
  }
}
//for compile we have to write "javac -d . class_name.java"
//for run "java pacakge_name.class_name"