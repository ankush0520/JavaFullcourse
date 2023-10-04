import java.io.*;
class fileWriter
{
	public static void main(String[] args)
	{
		try
		{
			FileWriter f=new FileWriter("C:\\Users\\hp\\OneDrive\\Desktop\\ank.txt");
			try 
			{
				f.write("Java programming is the best language.....!");
			}
			finally
			{
				f.close();
			}
			System.out.println("Sucessfully Data wrote in File");
		}
		catch(IOException i) 
		{
           System.out.println(i);
		}
	}
}