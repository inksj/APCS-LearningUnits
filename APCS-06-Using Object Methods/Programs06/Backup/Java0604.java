// Java0604.java
// This program demonstrates how an object can be declared and defined all in one statement.
// It also demonstrates the <checkingWithdrawal> and <savingsWithdrawal> methods of the <Bank> class.
// It also demonstrates other <Bank> class methods like <getCombined>.
// This method returns the combined checking and savings balance.
// It also shows how to close bank accounts with the <closeChecking> and the <closeSavings> methods.


public class Java0604
{
	public static void main (String args[])
	{
		System.out.println("\nJAVA0604.JAVA\n");
		Bank tom = new Bank(5000.0,10000.0);
		Bank sue = new Bank(3000.0,15000.0);

		System.out.println("Tom's combined balance: " + tom.getCombined());
		System.out.println("Sue's combined balance: " + sue.getCombined());
		System.out.println();

		tom.checkingWithdrawal(4000);
		sue.savingsWithdrawal(10000);

		System.out.println("Tom's combined balance: " + tom.getCombined());
		System.out.println("Sue's combined balance: " + sue.getCombined());
		System.out.println();

		tom.closeChecking();
		tom.closeSavings();
		sue.closeChecking();
		sue.closeSavings();

		System.out.println("Tom's combined balance: " + tom.getCombined());
		System.out.println("Sue's combined balance: " + sue.getCombined());
		System.out.println();
	}
}

