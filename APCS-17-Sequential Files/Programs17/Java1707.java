// Java1707.java
// This program demonstrates how to create a multi-line textfile separated
// with the <newLine> method.


import java.io.*;


public class Java1707
{
	public static void main (String args[]) throws IOException
	{
		System.out.println("\nJava1707.java\n");
		BufferedWriter outStream =
			new BufferedWriter(new FileWriter("Java1707.dat"));	// #1
		outStream.write("The quick brown ");					// #2
		outStream.write("fox jumps over the lazy dog");			// #3
		outStream.newLine();									// #4
		outStream.write("on Sundays only,");					// #5
		outStream.newLine();									// #6
		outStream.write("unless it rains.");					// #7
		outStream.close();										// #8
		System.out.println("Java1707.dat is created\n");		// #9
	}
}
