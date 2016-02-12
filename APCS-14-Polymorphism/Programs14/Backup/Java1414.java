// Java1414.java
// This program partially implements the <Bank> class.
// Now the program does not compile.


public class Java1414
{
	public static void main (String args[])
	{
		System.out.println("\nJAVA1414.JAVA\n");
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

	public void makeCheckingDeposit(double amount)		{ checking += amount; }

	public void makeCheckingWithdrawal(double amount)	{ checking -= amount; }
}


