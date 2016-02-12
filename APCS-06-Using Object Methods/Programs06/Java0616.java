// Java0616.java
// This program demonstrates how to "right justify" integers with an object
// of the <DecimalFormat> class and the <format> method.


import java.text.DecimalFormat;


public class Java0616
{
	public static void main (String args[])
	{
		System.out.println("\nJAVA0616.JAVA\n");
		DecimalFormat output = new DecimalFormat("00000");
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

