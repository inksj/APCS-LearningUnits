// Java1814.java
// List case study #14
// This program introduces the "Binary Search" which searches a sorted list
// far more efficiently than a "Linear Search" can.


import java.util.*;
import java.text.DecimalFormat;


public class Java1814
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

		List14 array = new List14(listSize,listMin,listMax);
		array.display();
		array.pause();
		array.selectionSort();
		array.display();
		array.pause();

		System.out.print("\nEnter search number ===>>  ");
		int searchNumber = input.nextInt();
		int index = array.binarySearch(searchNumber);
		if (index == -1)
			System.out.println(searchNumber + " is not in the list");
		else
			System.out.println(searchNumber + " is found at index " + index);
	}
}



class List14
{
	private int intArray[];	// stores array elements
	private int size;  		// number of elements in the array
	private int minInt;  	// smallest random integer
	private int maxInt;  	// largest random integer

	public List14(int s, int min, int max)
	{

		Random rndInt = new Random(12345);
		minInt = min;
		maxInt = max;
		size = s;
		System.out.println("\nCONSTRUCTING LIST WITH VALUES in [" + minInt + ".." + maxInt + "] range");
		intArray =  new int[size];

		int range = maxInt - minInt + 1;
		for (int k = 0; k < size; k++)
			intArray[k] = rndInt.nextInt(range) + minInt;

	}

	public void display()
	{
		DecimalFormat output = new DecimalFormat("0000");
		System.out.println("\nDISPLAYING ARRAY ELEMENTS");
		for (int k = 0; k < size; k++)
			System.out.print(output.format(intArray[k]) + " ");
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

	public void selectionSort()
	{
		int p,q;
		int smallest;
		for (p = 0; p < size-1; p++)
		{
			smallest = p;
			for (q = p+1; q < size; q++)
				if (intArray[q] < intArray[smallest])
			smallest = q;
			if (intArray[p] != intArray[smallest])
				swap(p,smallest);
		}
	}

	public int binarySearch(int sn)
	{
		boolean found = false;
		int lo = 0;
		int hi = size-1;
		int mid = 0;
		while (lo <= hi && !found)
		{
			mid = (lo + hi) / 2;
			if (intArray[mid] == sn)
				found = true;
			else
			{
				if (sn > intArray[mid])
					lo = mid + 1;
				else
					hi = mid - 1;
			}
		}
		if (found)
			return mid;
		else
			return -1;
	}

}

