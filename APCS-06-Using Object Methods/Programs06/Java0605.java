// Java0605.java
// This program introduces the <Random> class, which is part of the <java.util>
// package.  The <nextInt> method returns a random integer value.  Note that the
// values change each time that you execute the program.


import java.util.Random;


public class Java0605
{
	public static void main (String args[])
	{
		System.out.println("\nJAVA0605.JAVA\n");
		Random rand = new Random();
		System.out.println(rand.nextInt());
		System.out.println(rand.nextInt());
		System.out.println(rand.nextInt());
		System.out.println(rand.nextInt());
		System.out.println(rand.nextInt());
		System.out.println(rand.nextInt());
		System.out.println(rand.nextInt());
		System.out.println(rand.nextInt());
		System.out.println(rand.nextInt());
		System.out.println(rand.nextInt());
		System.out.println();
	}
}

