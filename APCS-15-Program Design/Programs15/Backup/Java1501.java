// Java1501.java
// This program demonstrates an Arithmetic Exception.
// It also shows that taking the square root of a negative number
// does NOT cause an arithmetic exception.
// Instead, it displays NaN which means "Not a Number".

public class Java1501
{
	public static void main(String[] args)
	{
		System.out.println("The square root of -10 " + Math.sqrt(-10));
		System.out.println("1 divided by 0 equals  " + quotient(1,0));
	}

	public static int quotient(int numerator, int denominator)
	{
		return numerator / denominator;
	}
}
