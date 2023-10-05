//User-Defined package
package ankush;

class A
{
	private void show() //private access modifier
	{
		System.out.println("Learn Coding....");
	}
	public static void main(String[] args)
	{
		A r=new A();
		r.show();
	}
}
//for compile we have to write "javac -d . class_name.java"
//for run "java pacakge_name.class_name"