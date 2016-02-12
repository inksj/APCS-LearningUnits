// Java1708.java
// This program reads in the entire Java1707.dat or any other text file,
// line by line.  Additionally a <Scanner> object to enter a file name
// during program execution.


import java.io.*;
import java.util.Scanner;


public class Java1708
{
	public static void main (String args[]) throws IOException
	{
		System.out.println("\nJava1708.java\n");
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter an external file name ===>>  ");
		File inFile = new File(keyboard.nextLine());
		if (inFile.exists())
		{
			BufferedReader inStream =
			new BufferedReader(new FileReader(inFile));      // #1
			String inString;                                 // #2
			while((inString = inStream.readLine()) != null)  // #3
			    System.out.println(inString);                // #4
			inStream.close();
		}
		else
		{
			System.out.println("Specified file does not exist.");
			System.out.println("Program aborted.");
		}
		System.out.println();
	}
}

