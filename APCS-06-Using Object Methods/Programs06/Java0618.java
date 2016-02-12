// Java0618.java
// This program demonstrates how to display US currency amounts.
// Additionally note how the <format> methods rounds off to the nearest penny.
// It also shows that the <DecimalFormat> object does not need to be called <output>.


import java.text.DecimalFormat;


public class Java0618
{
	public static void main (String args[])
	{
		System.out.println("\nJAVA0618.JAVA\n");
		DecimalFormat money = new DecimalFormat("$0.00");
		System.out.println(money.format(1));
		System.out.println(money.format(12.2));
		System.out.println(money.format(123.32));
		System.out.println(money.format(1234.432));
		System.out.println(money.format(12345.543));
		System.out.println(money.format(123456.654));
		System.out.println(money.format(1234567.7651));
		System.out.println();
	}
}

