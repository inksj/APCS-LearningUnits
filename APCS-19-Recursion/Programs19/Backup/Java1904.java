// Java1904.java
// This program demonstrates the <count(a,b)> method, which displays
// consecutive integers from a to b.


public class Java1904
{

	public static void main(String args[])
	{
		System.out.println("CALLING ITERATIVE COUNT METHOD");
		count1(10,25);
		System.out.println("\n\nCALLING RECURSIVE COUNT METHOD");
		count2(26,40);
		System.out.println("\n\nEXECUTION TERMINATED");
	}

	/***** ITERATIVE COUNT **************************************************/
	public static void count1(int a, int b)
	{
		for (int k = a; k <= b; k++)
			System.out.print(k + "  ");
	}

	/***** RECURSIVE COUNT **************************************************/
	public static void count2(int a, int b)
	{
		if (a <= b)
		{
			System.out.print(a + "  ");
			count2(a+1,b);
		}
	}

}

