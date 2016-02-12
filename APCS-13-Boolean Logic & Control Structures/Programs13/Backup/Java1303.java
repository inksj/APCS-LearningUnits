// Java1303.java
// This program executes in the same manner as Java1302.java.
// The abbreviated Boolean assignment statement is used in place of the
// longer <if...else> syntax.


import java.util.Scanner;

public class Java1303
{
	public static void main (String args[])
	{
		System.out.println("\nJAVA1303.JAVA\n");
		Scanner input = new Scanner(System.in);
		int gcf;
		boolean correct = false;
		int attempt = 0;

		while (!correct)
		{
			attempt++;
			System.out.print("\nWhat is the GCF of 120 and 108?  -->  ");
			gcf = input.nextInt();

         	correct = (gcf == 12);
		}

		System.out.println("\nAnswered correctly after " + attempt + " Attempt(s).\n");
	}
}
