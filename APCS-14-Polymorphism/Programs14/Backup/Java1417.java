// Java1417.java
// This program shows that it is possible to have a field in an interface, but it
// must be final and initialized.


public class Java1417
{
	public static void main (String args[])
	{
		System.out.println("\nJAVA1417.JAVA\n");
		MyBank tom = new MyBank(5000.0);
        System.out.println("Tom's checking balance: " + tom.getCheckingBalance());
		System.out.println("Tom makes a $1500.00 checking deposit");
		tom.makeCheckingDeposit(1500.0);
		System.out.println("Tom's checking balance: " + tom.getCheckingBalance());
		System.out.println("Tom makes a $2500.00 checking withdrawal");
		tom.makeCheckingWithdrawal(2500.0);
		System.out.println("Tom's checking balance: " + tom.getCheckingBalance());
		System.out.println("Computing interest");
		tom.computeInterest();
		System.out.println("Tom's checking balance: " + tom.getCheckingBalance());
  		System.out.println();
	}
}


abstract interface Bank
{
	public final double rate = 0.05;
	public abstract double getCheckingBalance();
	public abstract void makeCheckingDeposit(double amount);
	public abstract void makeCheckingWithdrawal(double amount);
	public abstract void computeInterest();
}


class MyBank implements Bank
{
	private double checking;
	private double interest;

	public MyBank(double c)								{ checking = c; interest = 0.0;	}

	public double getCheckingBalance()					{ return checking; }

	public void makeCheckingDeposit(double amount)		{ checking += amount; }

	public void makeCheckingWithdrawal(double amount)	{ checking -= amount; }

	public void computeInterest()						{ interest = checking * rate; checking += interest; }
}


