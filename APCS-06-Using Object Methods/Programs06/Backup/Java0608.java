// Java0608.java
// This program introduces the <setSeed> method.  This method allows you to
// control the "randomness" and repeat the same sequence.


import java.util.Random;


public class Java0608
{
	public static void main (String args[])
	{
		System.out.println("\nJAVA0608.JAVA\n");
		Random rand = new Random(12345);
		System.out.println(rand.nextInt(100));
		System.out.println(rand.nextInt(100));
		System.out.println(rand.nextInt(100));
		System.out.println(rand.nextInt(100));
		System.out.println(rand.nextInt(100));
		System.out.println();

		rand.setSeed(12345);
		System.out.println(rand.nextInt(100));
		System.out.println(rand.nextInt(100));
		System.out.println(rand.nextInt(100));
		System.out.println(rand.nextInt(100));
		System.out.println(rand.nextInt(100));
		System.out.println();
	}
}

