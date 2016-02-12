// Java1903.java
// This program demonstrates the <Skip> method.


public class Java1903
{

	public static void main(String args[])
	{
		System.out.println("CALLING ITERATIVE SKIP METHOD");
		skip1(4);
		System.out.println("CALLING RECURSIVE SKIP METHOD");
		skip2(3);
		System.out.println("EXECUTION TERMINATED");
	}

	/***** ITERATIVE SKIP *************************************************/
	public static void skip1(int n)
	{
		for (int k = 1; k <= n; k++)
			System.out.println();
	}

	/***** RECURSIVE SKIP **************************************************/
	public static void skip2(int n)
	{
		if ( n > 0)
		{
			System.out.println();
			skip2(n-1);
		}
	}

}
