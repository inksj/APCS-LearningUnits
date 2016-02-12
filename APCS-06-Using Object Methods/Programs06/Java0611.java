// Java0611.java
// This program demonstrates how to control an Random class object so that it
// generates random upper-case letters.  Note how "type casting" with (char) is
// used to change random integers in the [65..90] range to [A..Z] letters.


import java.util.Random;


public class Java0611
{
	public static void main (String args[])
	{
		System.out.println("\nJAVA0611.JAVA\n");
		Random rand = new Random(12345);
		System.out.println( (char) (rand.nextInt(26) + 65) );
		System.out.println( (char) (rand.nextInt(26) + 65) );
		System.out.println( (char) (rand.nextInt(26) + 65) );
		System.out.println( (char) (rand.nextInt(26) + 65) );
		System.out.println( (char) (rand.nextInt(26) + 65) );
		System.out.println( (char) (rand.nextInt(26) + 65) );
		System.out.println( (char) (rand.nextInt(26) + 65) );
		System.out.println( (char) (rand.nextInt(26) + 65) );
		System.out.println( (char) (rand.nextInt(26) + 65) );
		System.out.println( (char) (rand.nextInt(26) + 65) );
		System.out.println();
	}
}

