// Java1105.java
// This program demonstrates the <remove> method of the <ArrayList> class to
// delete a specified list element.


import java.util.ArrayList;


public class Java1105
{
	public static void main(String args[])
	{
		System.out.println();
		System.out.println("Java1105.java\n");

		ArrayList names = new ArrayList();
		names.add("Isolde");
		names.add("John");
		names.add("Greg");
		names.add("Maria");
		names.add("Heidi");

		System.out.println("names contains " + names);
		System.out.println();

		names.remove(2);

		System.out.println("names contains " + names);
		System.out.println();

  		names.remove(3);

		System.out.println("names contains " + names);
		System.out.println();
  }
}

