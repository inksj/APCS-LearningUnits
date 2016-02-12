// Java0613.java
// This program demonstrates the <Math.random> method being used to display
// random real numbers in the range of 0 to 99.
// Note the comparisson with the <nextInt> method of the <Random> class.


import java.util.Random;


public class Java0613
{
	public static void main (String args[])
	{
		System.out.println("\nJAVA0613.JAVA\n");
		System.out.println("Math.random() method");
		System.out.println("====================");
		System.out.println(Math.random() * 100);
		System.out.println(Math.random() * 100);
		System.out.println(Math.random() * 100);
		System.out.println(Math.random() * 100);
		System.out.println(Math.random() * 100);
		System.out.println();
		System.out.println("Random class");
		System.out.println("============");
		Random rand = new Random(12345);
		System.out.println(rand.nextInt(100));
		System.out.println(rand.nextInt(100));
		System.out.println(rand.nextInt(100));
		System.out.println(rand.nextInt(100));
		System.out.println(rand.nextInt(100));
		System.out.println();
	}
}

