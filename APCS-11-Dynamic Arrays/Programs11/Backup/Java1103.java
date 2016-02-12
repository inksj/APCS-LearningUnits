// Java1103.java
// This program shows how to access specified elements in an <ArrayList> object
// with the <get> method.


import java.util.ArrayList;


public class Java1103
{
 	public static void main(String args[])
	{
		System.out.println();
		System.out.println("Java1103.java\n");

		ArrayList names = new ArrayList();
		names.add("Isolde");
		names.add("John");
		names.add("Greg");
		names.add("Maria");
		names.add("Heidi");

		System.out.println();
		for (int k = 0; k < names.size(); k++)
			System.out.println(names.get(k));
		System.out.println();

		for (int k = names.size()-1; k >= 0; k--)
			System.out.println(names.get(k));
		System.out.println();
  	}
}

