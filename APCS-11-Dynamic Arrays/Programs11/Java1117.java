// Java1117.java
// This program example demonstrates how to use the original <for>
// loop structure to display dynamic two-dimensional arrays.


import java.util.ArrayList;


public class Java1117
{
	public static void main (String args[])
	{
		System.out.println();
		System.out.println("Java1117.java\n");
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

		for (int row = 0; row < mammals.size(); row++)
		{
			for (int col = 0; col < mammals.get(row).size(); col++)
				System.out.println(mammals.get(row).get(col));
			System.out.println();
		}
		System.out.println();
	}
}

