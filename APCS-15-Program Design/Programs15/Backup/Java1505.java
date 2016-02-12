// Java1505.java
// This program shows that typecasting is not always possible.

public class Java1505
{
	public static void main(String[] args)
	{
		System.out.println("10 divided by 5 equals " + quotient(10,5));
		System.out.println("100 divided by 13 equals " + quotient(100,13));
	}

	public static boolean quotient(int numerator, int denominator)
	{
		return (boolean)  numerator / denominator;
	}
}

