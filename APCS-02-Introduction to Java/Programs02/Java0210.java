// Java0210.java
// This program demonstrates escape sequences in Java


public class Java0210
{
	public static void main (String args[])
	{

		//  \n performs a carriage-return and a line-feed
      	System.out.println("\nProgram Java0210.java\n");

      	//  \t performs a horizontal tab
		System.out.println("\tONE\tTWO\tTHREE\n");

		//  \r performs only a carriage-return without a line-feed
		System.out.print("Hello John\r");
		System.out.println("How are you doing?\n");

		//  \\ displays a single backslash
		System.out.println("Path C:\\Java\\bin\n");

		//  \" displays double quotes
		System.out.println("Enter the name \"Kathy Smith\" with double quotes\n");

	}
}

