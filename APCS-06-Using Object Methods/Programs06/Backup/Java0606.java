// Java0606.java
// This program "seeds" the Random object with a specific starting seed.
// Multiple executions will now display the same random numbers.


import java.util.Random;


public class Java0606
{
	public static void main (String args[])
	{
		System.out.println("\nJAVA0606.JAVA\n");
		Random rand = new Random(12345);
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

