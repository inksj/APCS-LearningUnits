// TextLab10st.java
// The Student Records File Program
// This is the student, starting version of the TextLab10 assignment.


import java.io.*;
import java.text.DecimalFormat;


public class TextLab10st
{
	public static void main (String args[]) throws IOException
	{
		System.out.println("\nTextLab10\n");
		DecimalFormat df = new DecimalFormat("00.000");
		File f1 = new File("students.dat");
		File f2 = new File("passing.dat");
		File f3 = new File("honors.dat");
		f2.delete();
		f3.delete();

		if (f1.exists())
		{
			FileReader inFile = new FileReader(f1);
			BufferedReader inStream = new BufferedReader(inFile);








		}
		else
		{
			System.out.println(f1.getName() + " does not exist");
		}
		System.out.println();
	}
}
