// Java1701.java
// This program demonstrates how to check if an external text file exists
// using the <getName> and <exists> methods of the <File> class.


import java.io.*;


public class Java1701
{
	public static void main (String args[])
	{
		System.out.println("\nJava1701.java\n");
		File file1 = new File("qwerty.dat");
		System.out.print(file1.getName());
		if (file1.exists())
			System.out.println(" exists.");
		else
			System.out.println(" does not exist.");

		File file2 = new File("Java1701.dat");
		System.out.print(file2.getName());
		if (file2.exists())
			System.out.println(" exists.\n");
		else
			System.out.println(" does not exist.\n");
	}
}
