// Java0610.java
// This program demonstrates how to control an Random class object so that it
// generates integers in a desired range.  In this example the range is [10..99].


import java.util.Random;


public class Java0610
{
	public static void main (String args[])
	{
		System.out.println("\nJAVA0610.JAVA\n");
		Random rand = new Random(12345);
		System.out.println(rand.nextInt(90) + 10);
		System.out.println(rand.nextInt(90) + 10);
		System.out.println(rand.nextInt(90) + 10);
		System.out.println(rand.nextInt(90) + 10);
		System.out.println(rand.nextInt(90) + 10);
		System.out.println(rand.nextInt(90) + 10);
		System.out.println(rand.nextInt(90) + 10);
		System.out.println(rand.nextInt(90) + 10);
		System.out.println(rand.nextInt(90) + 10);
		System.out.println(rand.nextInt(90) + 10);
		System.out.println();
	}
}

