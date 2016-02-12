// Java0601.java
// This program demonstrates that the methods of a class are not always
// accessible, like they were with the <Math> class.  In this case an
// attempt is made to use methods of the <Bank> class without success.


public class Java0601
{
	public static void main (String args[])
	{
		System.out.println("\nJAVA0601.JAVA\n");
		Bank.checkingDeposit(1000.0);
		Bank.savingsDeposit(5000.0);
		System.out.println("Checking balance: " + Bank.getChecking());
		System.out.println("Savings balance:  " + Bank.getSavings());
		System.out.println();
	}
}


