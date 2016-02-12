// Java1104.java
// This program demonstrates the <set> method of the <ArrayList> class, which
// replaces existing elements with a new object.


import java.util.ArrayList;


public class Java1104
{
	public static void main(String args[])
	{
		System.out.println();
		System.out.println("Java1104.java\n");

		ArrayList names = new ArrayList();
		names.add("Isolde");
		names.add("John");
		names.add("Greg");
		names.add("Maria");
		names.add("Heidi");

		System.out.println("names contains " + names);
		System.out.println();

		names.set(1,"Jessica");
		names.set(2,"Anthony");
		names.set(3,"Haley");
		names.set(4,"Alec");

		System.out.println("names contains " + names);
		System.out.println();
	}
}

