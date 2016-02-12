// Java1811.java
// List case study #11
// This program makes the BubbleSort "smart" by adding a conditional
// loop structure to see if the list is sorted.


import java.util.*;


public class Java1811
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

		List11 array = new List11(listSize,listMin,listMax);
		array.display();
		array.pause();
		array.bubbleSort();
		array.display();
		array.pause();
		System.out.println();
	}
}


class List11
{
	private int intArray[];	// stores array elements
	private int size;  		// number of elements in the array
	private int minInt;  	// smallest random integer
	private int maxInt;  	// largest random integer

	public List11(int s, int min, int max)
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

	private void swap(int x, int y)
	{
		int temp = intArray[x];
		intArray[x] = intArray[y];
		intArray[y] = temp;
	}

	public void bubbleSort()
	{
		boolean sorted;
		int p = 1;
		do
		{
		sorted = true;
			for (int q = 0; q < size-p; q++)
				if (intArray[q] > intArray[q+1])
				{
					swap(q,q+1);
					sorted = false;
				}
			p++;
		}
		while (!sorted);
	}

}

