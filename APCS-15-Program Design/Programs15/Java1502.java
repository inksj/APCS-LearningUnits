// Java1502.java
// This program tries to protect against division by zero.
// The result is not exactly what we want.

public class Java1502
{
	public static void main(String[] args)
	{
		System.out.println("10 divided by 5 equals " + quotient(10,5));
		System.out.println("1 divided by 0 equals " + quotient(1,0));
		System.out.println("100 divided by 13 equals " + quotient(100,13));
	}

	public static int quotient(int numerator, int denominator)
	{
		if (denominator == 0)
		{
			System.out.print("Error... Division by Zero.   ");
			return 0; // Will not compile without this return statement
		}
		else
			return numerator / denominator;
	}
}
