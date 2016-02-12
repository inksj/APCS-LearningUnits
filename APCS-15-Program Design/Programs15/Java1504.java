// Java1504.java
// This program reviews "typecasting".

public class Java1504
{
	public static void main(String[] args)
	{
		System.out.println("10 divided by 5 equals " + quotient(10,5));
		System.out.println("100 divided by 13 equals " + quotient(100,13));
	}

	public static double quotient(int numerator, int denominator)
	{
		return (double)  numerator / denominator;
	}
}
