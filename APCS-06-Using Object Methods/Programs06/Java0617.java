// Java0617.java
// This program demonstrates how to insert commas in numerical output
// with a <DecimalFormat> object.


import java.text.DecimalFormat;


public class Java0617
{
	public static void main (String args[])
	{
		System.out.println("\nJAVA0617.JAVA\n");
		DecimalFormat output = new DecimalFormat("0,000,000");
		System.out.println(output.format(1));
		System.out.println(output.format(12));
		System.out.println(output.format(123));
		System.out.println(output.format(1234));
		System.out.println(output.format(12345));
		System.out.println(output.format(123456));
		System.out.println(output.format(1234567));
		System.out.println();
	}
}

