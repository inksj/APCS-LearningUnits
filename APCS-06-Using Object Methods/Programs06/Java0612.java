// Java0612.java
// This program demonstrates the Math.random method.
// Notice that it behaves just like the nextDouble method of the Random class.
// Both will return a random real number n such that 0 <= n < 1


import java.util.Random;  // needed for Random class, but not needed for Math.random method


public class Java0612
{
	public static void main (String args[])
	{
		System.out.println("\nJAVA0612.JAVA\n");
		System.out.println("Math.random() method");
		System.out.println("====================");
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println();
		System.out.println("Random class");
		System.out.println("============");
		Random rand = new Random(12345);
		System.out.println(rand.nextDouble());
		System.out.println(rand.nextDouble());
		System.out.println(rand.nextDouble());
		System.out.println(rand.nextDouble());
		System.out.println(rand.nextDouble());
		System.out.println();
	}
}

