import java.io.*;
class createFile
{
  public static void main(String[] args) // we can remove try and catch block and write (public static void main(String[] args) throws IOException)
  {
		File f=new File("C:\\Users\\hp\\OneDrive\\Desktop\\ank.txt");
	try
	{
		if(f.createNewFile())
		{
			System.out.println("File Successfully Create....!");
		}
		else
		{
			System.out.println("File Already Exist....!");
		}
	}
	catch(IOException i)
	{
		System.out.println("Exception Handled....!");
	}
  }
}
//////////
