// Java1705.java
// This program is identical to Java1704.java with the <FileWriter> class
// and <BufferedWriter> class statements combined in one statement.


import java.io.*;


public class Java1705
{
	public static void main (String args[]) throws IOException
	{
		System.out.println("\nJava1705.java\n");
		BufferedWriter outStream = new BufferedWriter(new FileWriter("Java1705.dat"));
		String outString = "Too bad Java has so few I/O classes";
		outStream.write(outString);
		outStream.close();
		System.out.println("Java1705.dat is created\n");
	}
}
