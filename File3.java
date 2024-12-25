import java.io.*;
class fileReader
{
	public static void main(String[] args)
	{
		try
		{
			FileReader r=new FileReader("C:\\Users\\hp\\OneDrive\\Desktop\\ank.txt");
			try
			{
               int i;
               while((i=r.read())!=-1)
               {
               	System.out.print((char)i);
               }
			}
			finally
			{
               r.close();
               System.out.print("File Closed");
			}
		}
		catch(IOException e)
		{
		   System.out.println("Exception Handled...!");
		}
	}
}
//////////
