// Java1115.java
// It is possible for each member of an <ArrayList> object to be an <ArrayList> object.
// This creates an array of arrays or two-dimensional dynamic array.
// In this example you get an <ArrayList> of <ArrayList> of <String> elements.
// Observe the nested generics syntax of ArrayList<ArrayList<String>>.


import java.util.ArrayList;


public class Java1115
{
	public static void main (String args[])
	{
		System.out.println();
		System.out.println("Java1115.java\n");
		ArrayList<String> cats = new ArrayList<String>();
		cats.add("Lions");
		cats.add("Tigers");

		ArrayList<String> swimmers = new ArrayList<String>();
		swimmers.add("Whales");
		swimmers.add("Dolphins");

		ArrayList<String> primates = new ArrayList<String>();
		primates.add("Gorillas");
		primates.add("Chimpanzees");

		ArrayList<ArrayList<String>> mammals = new ArrayList<ArrayList<String>>();
		mammals.add(cats);
		mammals.add(swimmers);
		mammals.add(primates);

		System.out.println(mammals);
		System.out.println();
	}
}

