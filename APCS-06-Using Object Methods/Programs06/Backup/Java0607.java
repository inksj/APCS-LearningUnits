// Java0607.java
// This program demonstrates the second "overloaded" <nextInt(n)> method,
// which returns an integer x, such that 0 <= x < n.


import java.util.Random;


public class Java0607
{
	public static void main (String args[])
	{
		System.out.println("\nJAVA0607.JAVA\n");
		Random rand = new Random(12345);
		System.out.println(rand.nextInt(100));
		System.out.println(rand.nextInt(100));
		System.out.println(rand.nextInt(100));
		System.out.println(rand.nextInt(100));
		System.out.println(rand.nextInt(100));
		System.out.println(rand.nextInt(100));
		System.out.println(rand.nextInt(100));
		System.out.println(rand.nextInt(100));
		System.out.println(rand.nextInt(100));
		System.out.println(rand.nextInt(100));
		System.out.println();
	}
}

