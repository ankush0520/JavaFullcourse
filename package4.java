//User-Defined package

package ankush;

public class A
{
	public void show()
	{
		System.out.println("Learn Coding....!");
	}
	
}
//for compile we have to write "javac -d . class_name.java"
//for run "java pacakge_name.class_name"
//new file c.java and new package public is accessed outside the package any where
package gupta;
import ankush.*;
class c
{
	public static void main(String[] args)
	{
		A r=new A();
		r.show();
	}
}
