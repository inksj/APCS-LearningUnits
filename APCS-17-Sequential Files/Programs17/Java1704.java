// Java1704.java
// This program demonstrates how to create textfiles with the <FileWriter> class,
// <BufferedWriter> class and the <write> method.


import java.io.*;


public class Java1704
{
	public static void main (String args[]) throws IOException
	{
		System.out.println("\nJava1704.java\n");
		FileWriter outFile = new FileWriter("Java1704.dat");	  	// #1
		BufferedWriter outStream = new BufferedWriter(outFile);		// #2
		String outString = "Too bad Java has so few I/O classes"; 	// #3
		outStream.write(outString);									// #4
		outStream.close();											// #5
		System.out.println("Java1704.dat is created\n");			// #6
	}
}
