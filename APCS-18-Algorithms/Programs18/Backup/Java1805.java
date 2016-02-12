// Java1805.java
// List case study #5
// This program introduces the "inefficient" Linear Search algorithm.


import java.util.*;


public class Java1805
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter list size      ===>>  ");
		int listSize = input.nextInt();
		System.out.print("Enter minimum value  ===>>  ");
		int listMin = input.nextInt();
		System.out.print("Enter maximum value  ===>>  ");
		int listMax = input.nextInt();

		List5 array = new List5(listSize,listMin,listMax);
		array.display();
		array.pause();

		System.out.print("\nEnter search number ===>>  ");
		int searchNumber = input.nextInt();
		if (array.linearSearch(searchNumber))
			System.out.println(searchNumber + " is in the list");
		else
			System.out.println(searchNumber + " is not in the list");
		System.out.println();
	}
}



class List5
{
	private int intArray[];	// stores array elements
	private int size;  		// number of elements in the array
	private int minInt;  	// smallest random integer
	private int maxInt;  	// largest random integer

	public List5(int s, int min, int max)
	{
		Random rndInt = new Random(12345);
		minInt = min;
		maxInt = max;
		size = s;
		System.out.println("\nCONSTRUCTING LIST WITH VALUES in [" + minInt + ".." + maxInt + "] range");
		intArray = new int[size];
		int range = maxInt - minInt + 1;
		for (int k = 0; k < size; k++)
			intArray[k] = rndInt.nextInt(range) + minInt;
	}

	public void display()
	{
		System.out.println("\nDISPLAYING ARRAY ELEMENTS");
		for (int k = 0; k < size; k++)
			System.out.print(intArray[k] + "  ");
		System.out.println();
	}

	public void pause()
	{
		Scanner input = new Scanner(System.in);
		String dummy;
		System.out.print("\nPress <Enter> to continue  ===>>  ");
		dummy = input.nextLine();
	}

	public boolean linearSearch(int sn)
	{
		boolean found = false;
		for (int k = 0; k < size; k++)
			if (intArray[k] == sn)
				found = true;
		return found;
	}

}

