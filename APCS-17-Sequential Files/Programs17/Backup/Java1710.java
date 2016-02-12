// Java1710.java
// This program retrieves the random integer textfile created by program
// Java1709.java.  The stored character strings are converted back to
// integers.  The integer value of the integers is computed and displayed
// to prove that the values are in fact integers.


import java.io.*;


public class Java1710
{
	public static void main (String args[]) throws IOException
	{
		System.out.println("\nJava1710.java\n");
		BufferedReader inStream =
		new BufferedReader(new FileReader("Java1709.dat"));		// #1
		String inString;										// #2
		int rndInt;												// #3
		int sum = 0;											// #4
		while((inString = inStream.readLine()) != null)			// #5
		{
			System.out.println(inString);						// #6
			rndInt = Integer.parseInt(inString);        		// #7
			sum += rndInt;										// #8
		}
		inStream.close();    									// #9
		System.out.println("sum equals " + sum);				// #10
		System.out.println();
	}
}
