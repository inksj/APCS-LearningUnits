// Java1910.java
// This program demonstrates the <fibo> method.
// Note that this style of recursion becomes unacceptibly slow when the requested
// Fibonacci number becomes larger.


import java.util.*;


public class Java1910
{

	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter requested Fibonacci number  ===>>  ");
		int number = input.nextInt();
		System.out.println("\n\nCALLING ITERATIVE FIBO METHOD");
		System.out.println("Fibonacci(" + number + ") is  " + fibo1(number));
		System.out.println("\n\nCALLING RECURSIVE FIBO METHOD");
		System.out.println("Fibonacci(" + number + ") is  " + fibo2(number));
		System.out.println("\n\nEXECUTION TERMINATED");
	}

	/***** ITERATIVE FIBO *************************************************/
	public static int fibo1(int n)
	{
		int n1 = 1;
		int n2 = 1;
		int n3 = 1;
		if (n == 1 || n == 2)
			return 1;
		else
		{
			for (int k = 3; k <= n; k++)
			{
				n3 = n1 + n2;
				n1 = n2;
				n2 = n3;
			}
		}
		return n3;
	}

	/***** RECURSIVE FIBO **************************************************/
	public static int fibo2(int n)
	{
		if (n == 1 || n == 2)
			return 1;
		else
			return fibo2(n-1) + fibo2(n-2);
	}

}
