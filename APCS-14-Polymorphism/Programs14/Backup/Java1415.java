// Java1415.java
// This program demonstrates that it is possible to implement an interface and
// define additional methods that are not declared in the interface.


public class Java1415
{
	public static void main (String args[])
	{
		System.out.println("\nJAVA1415.JAVA\n");
		MyBank tom = new MyBank(5000.0);
        System.out.println("Tom's checking balance: " + tom.getCheckingBalance());
		System.out.println("Tom makes a $1500.00 checking deposit");
		tom.makeCheckingDeposit(1500.0);
		System.out.println("Tom's checking balance: " + tom.getCheckingBalance());
		System.out.println("Tom makes a $2500.00 checking withdrawal");
		tom.makeCheckingWithdrawal(2500.0);
		System.out.println("Tom's checking balance: " + tom.getCheckingBalance());
		tom.closeAccount();
		System.out.println("Tom's checking balance: " + tom.getCheckingBalance());
  		System.out.println();
	}
}


abstract interface Bank
{
	public abstract double getCheckingBalance();

	public abstract void makeCheckingDeposit(double amount);

	public abstract void makeCheckingWithdrawal(double amount);
}


class MyBank implements Bank
{
	private double checking;

	public MyBank(double c)								{ checking = c;	}

	public double getCheckingBalance()					{ return checking; }

	public void makeCheckingDeposit(double amount)		{ checking += amount; }

	public void makeCheckingWithdrawal(double amount)	{ checking -= amount; }

	public void closeAccount()							{ checking = 0; }
}


