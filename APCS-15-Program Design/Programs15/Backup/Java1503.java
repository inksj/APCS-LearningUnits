// Java1503.java
// This program demonstrates a user-created Illegal Argument Exception.

public class Java1503
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
			throw new IllegalArgumentException("\nError... Division by Zero");
		else
			return numerator / denominator;
	}
}
