// Java0603.java
// This program demonstrates how an object can be constructed with a specified
// initial balance in checking and savings.  Most Java classes have multiple
// constructors to create objects for multiple situations.


public class Java0603
{
	public static void main (String args[])
	{
		System.out.println("\nJAVA0603.JAVA\n");
		Bank tom;
		tom = new Bank(5000.0,10000.0);
		Bank sue;
		sue = new Bank(3000.0,15000.0);

        System.out.println("Tom's checking balance: " + tom.getChecking());
		System.out.println("Tom's savings balance:  " + tom.getSavings());
		System.out.println("Sue's checking balance: " + sue.getChecking());
		System.out.println("Sue's savings balance:  " + sue.getSavings());
		System.out.println();

		System.out.println("Tom makes a $1000.00 checking deposit");
		tom.checkingDeposit(1000.0);
		System.out.println("Tom makes a $2000.00 savings deposit");
		tom.savingsDeposit(2000.0);
		System.out.println("Sue makes a $1500.00 checking deposit");
		sue.checkingDeposit(1500.0);
		System.out.println("Sue makes a $3000.00 savings deposit");
		sue.savingsDeposit(3000.0);
		System.out.println();

		System.out.println("Tom's checking balance: " + tom.getChecking());
		System.out.println("Tom's savings balance:  " + tom.getSavings());
		System.out.println("Sue's checking balance: " + sue.getChecking());
		System.out.println("Sue's savings balance:  " + sue.getSavings());
		System.out.println();
	}
}

