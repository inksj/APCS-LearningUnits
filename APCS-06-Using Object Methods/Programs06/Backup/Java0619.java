// Java0619.java
// This program demonstrates how to control rounding off to a specified
// number of digits beyond the decimal point.


import java.text.DecimalFormat;


public class Java0619
{
	public static void main (String args[])
	{
		System.out.println("\nJAVA0619.JAVA\n");
		DecimalFormat output1 = new DecimalFormat("0.0");
		DecimalFormat output2 = new DecimalFormat("0.00");
		DecimalFormat output3 = new DecimalFormat("0.000");
		DecimalFormat output4 = new DecimalFormat("0.0000");
		DecimalFormat output5 = new DecimalFormat("0.00000");
		DecimalFormat output6 = new DecimalFormat("0.000000");
		DecimalFormat output7 = new DecimalFormat("0.0000000");
		DecimalFormat output8 = new DecimalFormat("0.00000000");

		System.out.println(Math.PI);
		System.out.println(output1.format(Math.PI));
		System.out.println(output2.format(Math.PI));
		System.out.println(output3.format(Math.PI));
		System.out.println(output4.format(Math.PI));
		System.out.println(output5.format(Math.PI));
		System.out.println(output6.format(Math.PI));
		System.out.println(output7.format(Math.PI));
		System.out.println(output8.format(Math.PI));
		System.out.println();
	}
}

