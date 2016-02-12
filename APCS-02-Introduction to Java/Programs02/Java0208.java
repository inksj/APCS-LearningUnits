
// Java0208.java

/* This program is very similar to the previous program, but the output will be different.
   Instead of displaying all number words from "One" through "Thirteen",
   it will only display some of them.
   There are actually 2 kinds of comments in Java.
   "Single-Line Comments" are the type you saw in the last program.
   They begin with a double slash.
   Java also has "Multi-Line Comments".
   To create a multi-line comment, you begin with a slash and an asterisk.
   You conclude a multi-line comment with an asterisk followed by a slash.
   This can be very useful in program development.
   This time the output will not show the words "Seven" through "Eleven" because they
   have been "commented-out" with a multi-line comment.  */

public class Java0208
{
	public static void main (String args[])
	{
		System.out.println("One");
		System.out.println("Two");
		System.out.println("Three");
		System.out.println("Four");
		System.out.println("Five");
		System.out.println("Six");        // half a dozen
/*		System.out.println("Seven");
		System.out.println("Eight");
		System.out.println("Nine");
		System.out.println("Ten");
		System.out.println("Eleven");
*/		System.out.println("Twelve");     // one dozen
		System.out.println("Thirteen");   // one baker's dozen
	}
}


