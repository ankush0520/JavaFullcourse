          /*Multiple Inheritance through Interface*/

interface A
{
	void Show(); //public+abstract
}
interface B
{
	void Disp(); //public+abstract
}
class Multiple implements A,B
{
  public void Show()
  {
  	System.out.println("Interface A");
  }
  public void Disp()
  {
  	System.out.println("Interface B");
  }
  public static void main(String[] args)
  {
  	Multiple m=new Multiple();
  	m.Show();
  	m.Disp();
  }
}
//////////////////
