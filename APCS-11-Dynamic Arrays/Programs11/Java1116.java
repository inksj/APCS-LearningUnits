// Java1116.java
// This program demonstrates how to display the elements of a
// two-dimensional dynamic array and it also shows how to use
// a set of nested <for..each> loop structures.


import java.util.ArrayList;


public class Java1116
{
	public static void main (String args[])
	{
		System.out.println();
		System.out.println("Java1116.java\n");
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

		for (ArrayList<String> mammal: mammals)
		{
			for (String animal: mammal)
				System.out.println(animal);
			System.out.println();
		}
		System.out.println();
	}
}

