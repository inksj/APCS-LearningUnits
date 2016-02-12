// Java1609.java
// This program demonstrates the <equals> method, which is capable of
// testing equality of string objects correctly.


import java.util.*;

public class Java1609
{
	public static void main (String args[])
	{
		System.out.println("\nJava1609.java\n");
		Scanner input = new Scanner(System.in);
		String s1 = "Foxtrot";
		String s2 = "Waltz";
		System.out.print("Enter a string ===>>  ");
		String s3 = input.nextLine();

		if (s1.equals(s2))
			System.out.println(s1 + " == " + s2);
		else
			System.out.println(s1 + " != " + s2);
		if (s1.equals(s3))
			System.out.println(s1 + " == " + s3);
		else
			System.out.println(s1 + " != " + s3);
		System.out.println();
	}
}
