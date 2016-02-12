// Java1807.java
// List case study #7
// This program makes the Linear Search algorithm more practical
// by returning the index of the SearchNumber or -1 if not found.


import java.util.*;


public class Java1807
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

		List7 array = new List7(listSize,listMin,listMax);
		array.display();
		array.pause();

		System.out.print("\nEnter search number ===>>  ");
		int searchNumber = input.nextInt();
		int index = array.linearSearch(searchNumber);
		if (index == -1)
			System.out.println(searchNumber + " is not in the list");
		else
			System.out.println(searchNumber + " is found at index " + index);
		System.out.println();
	}
}


class List7
{
	private int intArray[];	// stores array elements
	private int size;  		// number of elements in the array
	private int minInt;  	// smallest random integer
	private int maxInt;  	// largest random integer

	public List7(int s, int min, int max)
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
			System.out.print(intArray[k] + " ");
		System.out.println();
	}

	public void pause()
	{
		Scanner input = new Scanner(System.in);
		String dummy;
		System.out.print("\nPress <Enter> to continue  ===>>  ");
		dummy = input.nextLine();
	}

	public int linearSearch(int sn)
	{
		boolean found = false;
		int k = 0;
		while (k < size && !found)
		{
			if (intArray[k] == sn)
				found = true;
			else
				k++;
		}
		if (found)
			return k;
		else
			return -1;
	}

}

