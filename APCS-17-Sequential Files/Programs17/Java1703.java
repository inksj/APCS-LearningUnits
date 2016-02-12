// Java1703.java
// This program demonstrates creating and deleting files with the
// <delete> and <createNewFile> methods.


import java.io.*;


public class Java1703
{
	public static void main (String args[]) throws IOException
	{
		System.out.println("\nJava1703.java\n");
		File f = new File("Java1703.dat");
		System.out.println("Before <create> File exists:  " + f.exists());
		f.createNewFile();
		System.out.println("After <create>  File exists:  " + f.exists());
		f.delete();
		System.out.println("After <delete>  File exists:  " + f.exists());
		System.out.println();
	}
}
