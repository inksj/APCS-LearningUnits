// Java1608.java
// This program checks equality of strings using the == operator.
// This program has unexpected results.


import java.util.Scanner;

public class Java1608
{
	public static void main (String args[])
	{
		System.out.println("\nJava1608.java\n");
		Scanner input = new Scanner(System.in);
		String s1 = "Foxtrot";
		String s2 = "Waltz";
		System.out.print("Enter a string ===>>  ");
		String s3 = input.nextLine();
		if (s1 == s2)
			System.out.println(s1 + " == " + s2);
		else
			System.out.println(s1 + " != " + s2);
		if (s1 == s3)
			System.out.println(s1 + " == " + s3);
		else
			System.out.println(s1 + " != " + s3);
		System.out.println();
	}
}
