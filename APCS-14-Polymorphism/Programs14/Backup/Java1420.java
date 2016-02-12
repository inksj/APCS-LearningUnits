// Java1420.java
// This program uses an abstract <Bank> class, rather than a <Bank> interface.
// There appears no difference between an abstract class and an interface.


public class Java1420
{
	public static void main (String args[])
	{
		System.out.println("\nJAVA1420.JAVA\n");
		MyBank tom = new MyBank(5000.0);
        System.out.println("Tom's checking balance: " + tom.getCheckingBalance());
		System.out.println("Tom makes a $1500.00 checking deposit");
		tom.makeCheckingDeposit(1500.0);
		System.out.println("Tom's checking balance: " + tom.getCheckingBalance());
		System.out.println("Tom makes a $2500.00 checking withdrawal");
		tom.makeCheckingWithdrawal(2500.0);
		System.out.println("Tom's checking balance: " + tom.getCheckingBalance());
  		System.out.println();
	}
}


abstract class Bank
{
	public abstract double getCheckingBalance();

	public abstract void makeCheckingDeposit(double amount);

	public abstract void makeCheckingWithdrawal(double amount);
}


class MyBank extends Bank
{
	private double checking;

	public MyBank(double c)								{ checking = c;	}

	public double getCheckingBalance()					{ return checking; }

	public void makeCheckingDeposit(double amount)		{ checking += amount; }

	public void makeCheckingWithdrawal(double amount)	{ checking -= amount; }
}


