// Java1709.java
// This program generates a textfile of 10 random integers.
// Each integer is converted with the <String.valueOf> method
// to a string before the number is transferred to the OutputStream.


import java.io.*;
import java.util.Random;


public class Java1709
{
	public static void main (String args[]) throws IOException
	{
		System.out.println("\nJava1709.java\n");
		Random rand = new Random(12345);
		BufferedWriter outStream =
			new BufferedWriter(new FileWriter("Java1709.dat"));		// #1
		int rndInt;													// #2
		for (int k = 1; k <= 10; k++)								// #3
		{
			rndInt =  rand.nextInt(9000) + 1000;					// #4
			outStream.write(String.valueOf(rndInt));				// #5
			outStream.newLine();									// #6
		}
		outStream.close();											// #7
		System.out.println("Java1709.dat is created\n");			// #8
	}
}
