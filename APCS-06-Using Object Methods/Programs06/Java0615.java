// Java0615.java
// This program demonstrates the <Math.random> method being used to display
// random integers in the range of 1000 to 9999 by using typecasting.
// Note the comparison with the <nextInt> method of the <Random> class.


import java.util.Random;


public class Java0615
{
	public static void main (String args[])
	{
		System.out.println("\nJAVA0615.JAVA\n");
		System.out.println("Math.random() method");
		System.out.println("====================");
		System.out.println( (int) (Math.random() * 9000) + 1000);
		System.out.println( (int) (Math.random() * 9000) + 1000);
		System.out.println( (int) (Math.random() * 9000) + 1000);
		System.out.println( (int) (Math.random() * 9000) + 1000);
		System.out.println( (int) (Math.random() * 9000) + 1000);
		System.out.println();
		System.out.println("Random class");
		System.out.println("============");
		Random rand = new Random(12345);
		System.out.println(rand.nextInt(9000) + 1000);
		System.out.println(rand.nextInt(9000) + 1000);
		System.out.println(rand.nextInt(9000) + 1000);
		System.out.println(rand.nextInt(9000) + 1000);
		System.out.println(rand.nextInt(9000) + 1000);
		System.out.println();
	}
}

