import java.util.ArrayDeque;
class JavaCollections
{
	public static void main(String[] args)
	{
		ArrayDeque<String> Name=new ArrayDeque<>();  //predefined Queue class and it is FIFO(First in First out)
		Name.add("Ankush"); //adding 0th element in Queue
		Name.add("Kumar");  //adding 1st element in Queue
		Name.add("Gupta");  //adding 2nd element in Queue

		System.out.println(Name);
		Name.remove();             //remove will delete the element (FIFO)
		System.out.println(Name); 	
    }
}
