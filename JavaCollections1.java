import java.util.LinkedList;
class JavaCollections
{
	public static void main(String[] main)
	{
		LinkedList<String> Name=new LinkedList<>();  //predefined LinkedList class
		Name.add("Ankush"); //adding 0th elemet in Linkedlist
		Name.add("Kumar");  //adding 1st elemet in Linkedlist
		Name.add("Gupta");  //adding 2nd elemet in Linkedlist

		System.out.println(Name);
		Name.addFirst("Ekram"); //adding the element in beginning of the linkedlist
		System.out.println(Name);
		Name.addLast("Anuj");   //adding the element in last of the linkedlist
		System.out.println(Name);
		Name.add(3,"RK");//adding the element in 3rd index of the linkedlist
		System.out.println(Name);
		Name.removeFirst(); //remove the element from start of the linkedlist
		System.out.println(Name);
		Name.removeLast();  //remove the element from end of the linkedlist
		System.out.println(Name);
		Name.remove(2);     //remove the element from 2nd index of the linkedlist
		System.out.println(Name);

		for(String str:Name)
		{
			System.out.println(str);
		}
    }
}
//////////////
