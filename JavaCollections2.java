import java.util.Stack;
class JavaCollections
{
	public static void main(String[] main)
	{
		Stack<String> Name=new Stack<>();  //predefined Stack class and it is LIFO(Last in First out)
		Name.push("Ankush"); //adding 0th element in Stack
		Name.push("Kumar");  //adding 1st element in Stack
		Name.push("Gupta");  //adding 2nd element in Stack

		System.out.println(Name);
		Name.pop();             //pop will delete the element (LIFO)
		System.out.println(Name);
    }
}
//////////
