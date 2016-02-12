// Java1416.java
// This program shows how one class, <BankAccounts> can implement two
// interfaces <Checking> and <Savings>.


public class Java1416
{
	public static void main (String args[])
	{
		System.out.println("\nJAVA1416.JAVA\n");
		BankAccounts tom = new BankAccounts(5000.0,7500.0);

        System.out.println("Tom's checking balance: " + tom.getCheckingBalance());
		System.out.println("Tom makes a $1500.00 checking deposit");
		tom.makeCheckingDeposit(1500.0);
		System.out.println("Tom's checking balance: " + tom.getCheckingBalance());
		System.out.println("Tom makes a $2500.00 checking withdrawal");
		tom.makeCheckingWithdrawal(2500.0);
		System.out.println("Tom's checking balance: " + tom.getCheckingBalance());
  		System.out.println();
  		System.out.println("Tom's savings balance: " + tom.getSavingsBalance());
		System.out.println("Tom makes a $1500.00 savings deposit");
		tom.makeSavingsDeposit(1500.0);
		System.out.println("Tom's savings balance: " + tom.getSavingsBalance());
		System.out.println("Tom makes a $2500.00 savings withdrawal");
		tom.makeSavingsWithdrawal(2500.0);
		System.out.println("Tom's savings balance: " + tom.getSavingsBalance());
		System.out.println();
	}
}


abstract interface Checking
{
	public abstract double getCheckingBalance();
	public abstract void makeCheckingDeposit(double amount);
	public abstract void makeCheckingWithdrawal(double amount);
}


abstract interface Savings
{
	public abstract double getSavingsBalance();
	public abstract void makeSavingsDeposit(double amount);
	public abstract void makeSavingsWithdrawal(double amount);
}


class BankAccounts implements Checking,Savings
{
	private double checking;
	private double savings;

	public BankAccounts(double c, double s)				{ checking = c; savings = s;	}

	public double getCheckingBalance()					{ return checking; }
	public double getSavingsBalance()					{ return savings; }
	public void makeCheckingDeposit(double amount)		{ checking += amount; }
	public void makeSavingsDeposit(double amount)		{ savings += amount; }
	public void makeCheckingWithdrawal(double amount)	{ checking -= amount; }
	public void makeSavingsWithdrawal(double amount)	{ savings -= amount; }
}


