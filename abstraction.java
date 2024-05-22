import java.util.Scanner;

abstract class bank
{
	private String Name="myBank";
	private String IFSC="myBank123";

	public void bankDetail()
	{ 
		System.out.println("Bank_Name: "+Name+" "+"Bank_IFSC Code: "+IFSC);
	}
	//password-123

	abstract void Deposite();
	abstract void Withdraw();
	abstract void CheckBalance();

}
class bankService extends bank
{
	private double balance=5000;
	private int password;
	public double money;

	public void Deposite()
	{
		System.out.print("Enter Password: ");
		Scanner s=new Scanner(System.in);
		password=s.nextInt();
		if(password==123)
		{
			System.out.print("Enter Deposite Amount:");
			money=s.nextDouble();
			balance=balance+money;
			System.out.println("Deposite Money: "+money);
			System.out.println("Total Balance: "+balance);

		}
		else 
		{
			System.out.println("Incorrect Password....");
		}
	}
	public void Withdraw()
	{
		System.out.print("Enter Password: ");
		Scanner s=new Scanner(System.in);
		password=s.nextInt();
		if(password==123)
		{
			System.out.print("Enter Withdraw Amount:");
			money=s.nextDouble();
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
		bankService b=new bankService();
		b.bankDetail();
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
		    /*System.out.println("Enter the Deposit amount: ");
		    Scanner s2=new Scanner(System.in);
		    Double m=s2.nextDouble(); */
			b.Deposite();
			break;
		case 2:
		   /* System.out.println("Enter the Withdraw amount: ");
		    Scanner s3=new Scanner(System.in);
		    Double n=s3.nextDouble();*/  
			b.Withdraw();
		    break;
		case 3: b.CheckBalance();
		    break;
		default: 
		    System.out.println("Invalid Choice...");        	
		}
	}
}
