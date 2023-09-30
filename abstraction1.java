abstract class animal
{
	void legs()
	{
		System.out.println("all animals haave 4 legs");
	}
	abstract void sound();
	abstract void eat();
}
class Dog extends animal
{
	@Override
	void sound()
	{
		System.out.println("Barking...");
	}
	void eat()
	{
		System.out.println("eating meat");
	}
}
class Cow extends animal
{
	@Override
	void sound()
	{
		System.out.println("Moo...");
	}
	void eat()
	{
		System.out.println("eating grass");
	}
}
class absClass
{
	public static void main(String[] args)
	{
		Dog d=new Dog();
		Cow c=new Cow();
		d.sound();
		d.eat();
		d.legs();
		c.sound();
		c.eat();
		c.legs();
	}
}