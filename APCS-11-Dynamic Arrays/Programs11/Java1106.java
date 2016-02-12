// Java1106.java
// This program demonstrates how to use the overloaded <add> method of the <ArrayList>
// class to insert new elements at a specified location.


import java.util.ArrayList;


public class Java1106
{
	public static void main(String args[])
	{
		System.out.println();
		System.out.println("Java1106.java\n");

		ArrayList names = new ArrayList();
		names.add("Isolde");
		names.add("John");
		names.add("Greg");
		names.add("Maria");
		names.add("Heidi");

		System.out.println("names contains " + names);
		System.out.println();

		names.add(2,"Jessica");

		System.out.println("names contains " + names);
		System.out.println();

  		names.add(3,"Anthony");

		System.out.println("names contains " + names);
		System.out.println();
		
		names.add(7,"Julia");
				System.out.println("names contains " + names);
		System.out.println();
  	}
}

