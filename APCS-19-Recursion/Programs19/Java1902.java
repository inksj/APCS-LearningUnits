// Java1902.java
// This program demonstrates how to add an "exit" or "base case"
// to control recursive calls.


public class Java1902
{

	static int k = 0;

	public static void main(String args[])
	{
		System.out.println("CALLING ITERATIVE COUNT METHOD");
		count1();
		System.out.println("\n\nCALLING RECURSIVE COUNT METHOD");
		count2();
		System.out.println("\n\nEXECUTION TERMINATED");
	}

	/***** ITERATIVE COUNT *************************************************/
	public static void count1()
	{
		for (int k = 1; k <= 100; k++)
			System.out.print(k + "  ");
	}

	/***** RECURSIVE COUNT **************************************************/
	public static void count2()
	{
		k++;
		System.out.print(k + "  ");
		if (k < 100)
			count2();
	}

}
