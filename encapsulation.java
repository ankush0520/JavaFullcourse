import java.util.Scanner;

class bank
{
	private double balance=5000;
	private int password;

	public void Deposite(double money)
	{
		System.out.print("Enter Password: ");
		Scanner s=new Scanner(System.in);
		password=s.nextInt();
		if(password==123)
		{
			balance=balance+money;
			System.out.println("Deposite Money: "+money);
			System.out.println("Total Balance: "+balance);

		}
		else 
		{
			System.out.println("Incorrect Password....");
		}
	}
	public void Withdraw(double money)
	{
		System.out.print("Enter Password: ");
		Scanner s=new Scanner(System.in);
		password=s.nextInt();
		if(password==123)
		{
			balance=balance-money;
			System.out.println("Withdraw Money: "+money);
			System.out.println("Total Balance: "+balance);

		}
		else 
		{
			System.out.println("Incorrect Password....");
		}
	}
	public void CheckBalance()
	{
		System.out.print("Enter Password: ");
		Scanner s=new Scanner(System.in);
		password=s.nextInt();
		if(password==123)
		{
			System.out.println("Total Balance: "+balance);
       	}
		else 
		{
			System.out.println("Incorrect Password....");
		}
	}
}
class Customer
{
	public static void main(String[] args)
	{
		bank b=new bank();
		int ch;
		System.out.println("1. Deposite Money:");
		System.out.println("2. Withdraw Money:");
		System.out.println("3. CheckBalnace:");

		System.out.println("\n Enter your choice:");
		Scanner s1=new Scanner(System.in);
		ch=s1.nextInt();

		switch(ch)
		{
		case 1:
		    System.out.println("Enter the Deposit amount: ");
		    Scanner s2=new Scanner(System.in);
		    Double m=s2.nextDouble(); 
			b.Deposite(m);
			break;
		case 2:
		    System.out.println("Enter the Withdraw amount: ");
		    Scanner s3=new Scanner(System.in);
		    Double n=s3.nextDouble();  
			b.Withdraw(n);
		    break;
		case 3: b.CheckBalance();
		    break;
		default: 
		    System.out.println("Invalid Choice...");        	
		}
	}
}
