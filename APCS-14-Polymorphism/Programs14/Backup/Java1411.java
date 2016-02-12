// Java1411.java
// The former <Bank> class is now a <Bank> interface.
// Only the method headings are shown.  The program does not compile.


public class Java1411
{
	public static void main (String args[])
	{
		System.out.println("\nJAVA1411.JAVA\n");
		Bank tom = new Bank();

  		System.out.println();
	}
}


interface Bank
{
	public double getCheckingBalance();

	public void makeCheckingDeposit(double amount);

	public void makeCheckingWithdrawal(double amount);
}


