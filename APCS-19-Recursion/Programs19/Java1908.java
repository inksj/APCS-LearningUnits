// Java1908.java
// This program demonstrates the <fact> method.


public class Java1908
{

	public static void main(String args[])
	{
		System.out.println("CALLING ITERATIVE FACTORIAL METHOD");
		System.out.println("6 Factorial  =  " + fact1(6));
		System.out.println("\n\nCALLING RECURSIVE FACTORIAL METHOD");
		System.out.println("7 Factorial  =  " + fact2(7));
		System.out.println("\n\nEXECUTION TERMINATED");
	}

	/***** ITERATIVE FACT *************************************************/
	public static int fact1(int n)
	{
		int temp = 1;
		for (int k = n; k > 0; k--)
			temp *= k;
      	return temp;
	}

	/***** RECURSIVE FACT **************************************************/
	public static int fact2(int n)
	{
		if (n == 0)
			return 1;
		else
			return n * fact2(n-1);
	}

}
