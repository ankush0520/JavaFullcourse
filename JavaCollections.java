import java.util.ArrayList;
class JavaCollections
{
	public static void main(String[] main)
	{
		ArrayList<String> Name=new ArrayList<>();  //predefined ArrayList class
		Name.add("Ankush"); //adding 0th elemet in array
		Name.add("Kumar");  //adding 1st elemet in array
		Name.add("Gupta");  //adding 2nd elemet in array
		System.out.println(Name);
		Name.add("Ekram"); //adding 3rd element in array
		System.out.println(Name);
		Name.add(1,"Rohit"); //adding "Rohit" on the 1st index of the array
		System.out.println(Name);
		Name.add(0,"Amir"); // adding "Amir" on the beginning on the array
		System.out.println(Name);
		Name.remove(1);   // delete the 1st index's element
		System.out.println(Name);
		Name.set(0,"Virat"); //replace the 0th index element with virat
		System.out.println(Name);

		System.out.println(Name.get(0)); //print only the 0th index element
		Name.clear();  // delete all the element from the array
		System.out.println(Name);
    }
}
/////////
