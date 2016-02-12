// Java1302.java
// This program demonstrates that boolean variables add readability to programs.


import java.util.Scanner;


public class Java1302
{
	public static void main (String args[])
	{
		System.out.println("\nJAVA1302.JAVA\n");
		Scanner input = new Scanner(System.in);
		int gcf;
		boolean correct = false;
		int attempt = 0;

		while (!correct)
		{
			attempt++;
			System.out.print("\nWhat is the GCF of 120 and 108?  -->  ");
			gcf = input.nextInt();

         	if (gcf == 12)
            	correct = true;
         	else
            	correct = false;
		}

		System.out.println("\nAnswered correctly after " + attempt + " Attempt(s).\n");
	}
}
