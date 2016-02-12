// Java1607.java
// This program converts string values to integer and double values using
// the <parseInt> and <parseDouble> methods of the <Integer> and <Double> classes.


public class Java1607
{
	public static void main (String args[])
	{
		System.out.println("\nJava1607.java\n");
		String s1 = "12345";
		String s2 = "123.321";
		int n1 = Integer.parseInt(s1);
		double n2 = Double.parseDouble(s2);
		System.out.println(n1 + " + " + n1 + " = " + (n1 + n1));
		System.out.println(n2 + " + " + n2 + " = " + (n2 + n2));
		System.out.println();
	}
}
