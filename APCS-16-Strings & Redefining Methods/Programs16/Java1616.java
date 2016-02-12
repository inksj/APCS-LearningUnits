// Java1616.java
// This program demonstrates <toString> behaves differently for the <ArrayList>
// class.  Note that "referenced" values are displayed, not the references.


import java.util.ArrayList;


public class Java1616
{
	public static void main (String args[])
	{
		System.out.println("\nJava1616.java\n");
		ArrayList<String> names = new ArrayList<String>();
		names.add("Isolde");
		names.add("John");
		names.add("Greg");
		names.add("Maria");
		names.add("Heidi");
		System.out.println("names:  " + names);
		System.out.println();
	}
}
