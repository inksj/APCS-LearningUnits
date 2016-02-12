// Java0627.java
// This demonstrates how to instantiate a <Scanner> object.
// The <input> object is used with the <nextLine> method to enter
// string values from the keyboard.


import java.util.Scanner;

public class Java0627
{
	public static void main (String args[])
	{
		Scanner input = new Scanner(System.in);
 		System.out.println("\nJAVA0627.JAVA\n");
		System.out.print("Enter name  ===>>  ");
		String name = input.nextLine();
		System.out.println("Name Entered:      " + name);
		System.out.println();
	}
}

