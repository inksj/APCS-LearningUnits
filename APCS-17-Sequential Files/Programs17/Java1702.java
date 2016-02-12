// Java1702.java
// This program demonstrates the <getName>, <exist>, <length>,
// <getAbsolutePath>, <canRead> and <canWrite> methods of the File class.


import java.io.*;


public class Java1702
{
	public static void main (String args[])
	{
		System.out.println("\nJava1702.java\n");
		File f = new File("Java1702.dat");
		System.out.println("File name:          " + f.getName());
		System.out.println("Does file exist:    " + f.exists());
		System.out.println("File size:          " + f.length());
		System.out.println("Complete file path: " + f.getAbsolutePath());
		System.out.println("File is readable:   " + f.canRead());
		System.out.println("File is writeable:  " + f.canWrite());
		System.out.println();
	}
}
