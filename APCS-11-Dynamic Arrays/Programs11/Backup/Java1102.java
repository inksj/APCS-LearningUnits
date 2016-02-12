// Java1102.java
// This program uses the <size> method to determine the number of elements
// in an <ArrayList> object.
// Note that the value returned by the <size> method changes when more names
// are added to the <ArrayList> object.


import java.util.ArrayList;


public class Java1102
{
	public static void main(String args[])
	{
		System.out.println();
		System.out.println("Java1102.java\n");

		ArrayList names = new ArrayList();
		names.add("Isolde");
		names.add("John");
		names.add("Greg");
		System.out.println("names contains " + names);;
		System.out.println("There are " + names.size() + " elements in the names object.");

		names.add("Maria");
		names.add("Heidi");
		System.out.println("names contains " + names);
		System.out.println("There are " + names.size() + " elements in the names object.");
		System.out.println();
  	}
}

