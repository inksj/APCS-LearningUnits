// Java1114.java
// This program shows three ways to display the members of an <ArrayList> object.
// The enhanced <for..each> loop works very well with <ArrayList> objects.


import java.util.ArrayList;


public class Java1114
{
	public static void main(String args[])
	{
		System.out.println();
		System.out.println("Java1114.java\n");

		ArrayList<String> names = new ArrayList<String>();
		names.add("Isolde");
		names.add("John");
		names.add("Greg");
		names.add("Maria");
		names.add("Heidi");

		System.out.println(names);
		System.out.println();

		for (int index = 0; index < names.size(); index++)
			System.out.println(names.get(index));
		System.out.println();

		for (String name: names)
			System.out.println(name);
		System.out.println();
  	}
}

