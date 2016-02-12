// Java1601.java
// This program demonstrates multiple ways to construct String objects.
// Note that all five string objects store the same information.


public class Java1601
{
	public static void main (String args[])
	{
		System.out.println("\nJava1601.java\n");
		String s1 = "Tango";
		System.out.println("s1:  " + s1);

		String s2 = new String();  	   			// Default constructor
		s2 = "Tango";
		System.out.println("s2:  " + s2);

		String s3 = new String("Tango");	   	// Overloaded constructor with String parameter
		System.out.println("s3:  " + s3);

		String s4 = new String(s3);	   			// Same constructor as s3
		System.out.println("s4:  " + s4);

		char dance[ ] = {'T','a','n','g','o'};
		String s5 = new String(dance);	   		// Overloaded constructor with char array parameter
		System.out.println("s5:  " + s5);
		System.out.println();
	}
}
