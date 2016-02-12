// Java1421.java
// An abstract class can have both abstract members and concrete members.
// An interface can only have abstract members.


public class Java1421
{
	public static void main (String args[])
	{
		System.out.println("\nJAVA1421.JAVA\n");
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
	protected double checking;

	protected Bank(double c)							{ checking = c;	}

	public abstract double getCheckingBalance();

	public abstract void makeCheckingDeposit(double amount);

	public abstract void makeCheckingWithdrawal(double amount);
}


class MyBank extends Bank
{
	protected MyBank(double c)							{ super(c);	}

	public double getCheckingBalance()					{ return checking; }

	public void makeCheckingDeposit(double amount)		{ checking += amount; }

	public void makeCheckingWithdrawal(double amount)	{ checking -= amount; }
}


