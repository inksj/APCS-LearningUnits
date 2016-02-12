// Java1410.java
// This program uses a <Bank> class, which will be used for
// interface program examples in this chapter.


public class Java1410
{
	public static void main (String args[])
	{
		System.out.println("\nJAVA1410.JAVA\n");
		Bank tom = new Bank(5000.0);
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


class Bank
{
	private double checking;

	public Bank(double c)								{ checking = c;	}

	public double getCheckingBalance()					{ return checking; }

	public void makeCheckingDeposit(double amount)		{ checking += amount; }

	public void makeCheckingWithdrawal(double amount)	{ checking -= amount; }
}


