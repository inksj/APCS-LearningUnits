// Java0602.java
// This program creates two Bank objects, called tom and sue.
// Each object stores its own Bank information.


public class Java0602
{
	public static void main (String args[])
	{
		System.out.println("\nJAVA0602.JAVA\n");
		Bank tom;
		tom = new Bank();
		Bank sue;
		sue = new Bank();

		tom.checkingDeposit(1000.0);
		tom.savingsDeposit(5000.0);
		sue.checkingDeposit(1500.0);
		sue.savingsDeposit(4000.0);

		System.out.println("Tom's checking balance: " + tom.getChecking());
		System.out.println("Tom's savings balance:  " + tom.getSavings());
		System.out.println("Sue's checking balance: " + sue.getChecking());
		System.out.println("Sue's savings balance:  " + sue.getSavings());
		System.out.println();
	}
}

