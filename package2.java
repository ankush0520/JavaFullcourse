//User-Defined package

package ankush;

public class A
{
	protected void show()
	{
		System.out.println("Learn Coding....");
	}
	
}
//for compile we have to write "javac -d . class_name.java"
//for run "java pacakge_name.class_name"
//new file c.java and new package protected is accessed outside the package(new package) with help of sub class
package gupta;
import ankush.*;
class  c extends A
{
	public static void main(String[] args)
	{
		c r=new c();
		r.show();
	}
}
/////////////////
