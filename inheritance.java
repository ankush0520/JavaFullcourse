class Student //super class
{
	int roll,marks;//we can use protected int but not private int in the case of inheritence
	String name;
	void input()
	{
		System.out.println("Enter roll,name & marks");
	}
}
class ankush extends Student //sub class
{
	void display()
	{
		roll=1;name="Ankush";marks=89;
		System.out.println(roll+" "+name+" "+marks);
	}
	public static void main(String[] args)
	{
		ankush a=new ankush();
		a.input();
		a.display();
	}
}
//////
