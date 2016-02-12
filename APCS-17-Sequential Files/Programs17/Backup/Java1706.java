// Java1706.java
// This program demonstrates how to retrieve textfiles with the <FileReader> class,
// <BufferedReader> class and the <readLine> method.  This program will retrieve
// the textfiles created by the Java1705.java.


import java.io.*;


public class Java1706
{
	public static void main (String args[]) throws IOException
	{
		System.out.println("\nJava1706.java\n");
		FileReader inFile = new FileReader("Java1705.dat");		// #1
		BufferedReader inStream = new BufferedReader(inFile);	// #2
		String inString = inStream.readLine();					// #3
		System.out.println(inString);        					// #4
		inStream.close();    									// #5
		System.out.println();
	}
}
